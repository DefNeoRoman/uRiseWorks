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

    public Build getBuild() {
        return build;
    }

    public void build(int n) {
        build = new Build();
        Floor currentFloor = new Floor(currentCountRooms);
        for (int i = 0; i < n; i++) {
            Room room = new Room((int) (i + Math.random() * i));
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
        ExecutorService service = Executors.newFixedThreadPool(TP_DEPTH);
        List<Future<List<Room>>> futures = new ArrayList<Future<List<Room>>>();
        List<Floor> floorList = build.getFloors();
        for (Floor floor : floorList) {
            SortingTask sortingTask = new SortingTask(floor);
            futures.add(service.submit(sortingTask));
        }
        Room minIndexRoom = null;
        int currentIndexInFutures = 0;
        int minIndexInFutures = 0;
        List<Room> currentRoomList = new ArrayList<>();
        while (true) {
            if (futures.size() == 0){
                break;
            }
            for (Future<List<Room>> future : futures) {
                List<Room> currentRooms = future.get();
                if (currentRooms.size() == 0) {
                    futures.remove(future);
                    break;
                }

                Room currentRoom = currentRooms.iterator().next();
                if (minIndexRoom == null || currentRoom.getId() < minIndexRoom.getId()) {
                    minIndexRoom = currentRoom;
                    minIndexInFutures = currentIndexInFutures;
                    currentIndexInFutures++;
                    continue;
                }
                currentIndexInFutures++;
            }

            resultBuild.addRoom(minIndexRoom);
            minIndexRoom = null;



        }

        return resultBuild;
    }

}
