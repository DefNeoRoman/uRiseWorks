package binarySortedStorage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
public class Composer {
    private final static int TP_DEPTH = Runtime.getRuntime().availableProcessors();
    private Build build; //  Комнаты кладутся в этажи, этажи кладутся в здание
    private int currentCountRooms = 1; // Число комнат в текущих этажах
    //Увеличивается 1 2 3 4 5, то есть с шагом 1
    private int numCurrentFloor = 0;
    private List<Room> listOfRooms = new ArrayList<>();
    public Build getBuild() {
        return build;
    }
    public void build(int n) {
        build = new Build();
        Floor currentFloor = new Floor(currentCountRooms);
        for (int l = 0; l < n; l++) {
            Room room1 = new Room((int) (l + Math.random() * l * l));  // Это просто формула из головы
            if (listOfRooms.contains(room1)) {
                l--;
            } else {
                listOfRooms.add(room1);
            }
        }
        for (int i = 0; i < n; i++) {
            Room room = listOfRooms.get(i);
            if (numCurrentFloor == currentCountRooms) {
                numCurrentFloor = 0;
                currentCountRooms++;
                currentFloor = new Floor(currentCountRooms);
            }
            if (currentFloor.getSize() < currentCountRooms) {
                currentFloor.add(room);
            }
            if (currentFloor.getSize() == currentCountRooms) {
                build.addFloor(currentFloor);
                currentFloor = new Floor(currentCountRooms);
                numCurrentFloor++;
                continue;
            }
        }
    }
    public Build binarySort(Build build) throws Exception {
        Build resultBuild = new Build();
        List<Floor> floorList = build.getFloors();
        List<Future<List<Room>>> futures = new ArrayList<>();
        ExecutorService service = Executors.newFixedThreadPool(TP_DEPTH);
        for (Floor floor : floorList) {
            SortingTask sortingTask = new SortingTask(floor);
            Future future = service.submit(sortingTask);
            futures.add(future);
        }
        Room minRoom = null;
        int minIndexFuture = 0;
        for (int i = 0; i < futures.size(); i++) {
            if (futures.size() == 0) {
                break;
            }
            List<Room> currentRoomList = futures.get(i).get();
            Room currentRoom = currentRoomList.get(0);
            if (minRoom == null || currentRoom.getId() < minRoom.getId()) {
                minRoom = currentRoom;
                minIndexFuture = i;
            }
            if (i == futures.size() - 1) {
                resultBuild.addRoom(minRoom);
                List<Room> rooms = futures.get(minIndexFuture).get();
                if (rooms.size() != 0) {
                    minRoom = null;
                    rooms.remove(0);
                    i = -1;
                }
                if (rooms.size() == 0) {
                    futures.remove(minIndexFuture);
                    i = -1;
                    continue;
                }
            }
            if (i < futures.size()) {
                continue;
            }
        }
        return resultBuild;
    }
}
