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
    private int generalCountRooms = 1; // Общее число комнат
    private int generalCountFloors = 1;// Общее число этажей
    private int currentRoom = 1;       //текущая комната
    private Floor currentFloor;         //текущий этаж

    public Build getBuild() {
        return build;
    }

    public void build(int n){
      generalCountRooms = n;
        for (int i=0; i < generalCountRooms; i++ ){
            Room room = new Room(i);
            if(currentFloor == null){
                currentFloor = new Floor(currentCountRooms);
            } else if(currentFloor.getSize() == currentCountRooms){
                build.addFloor(currentFloor);
                currentFloor = null;
                currentCountRooms++;
            }else{
                currentFloor.add(room);
            }

        }
    }
    public Build binarySort(Build build) throws Exception{
        ExecutorService service = Executors.newFixedThreadPool(TP_DEPTH);
        List<Floor> before = build.getFloors();
        List<Room> currentRoomList = new ArrayList<>();
        List<Future> lf = new ArrayList<>();
        for (Floor f: before){
            SortingTask st = new SortingTask(f);
           Future future = service.submit(st);
            lf.add(future);
        }
        for(Future f: lf){

        }
        int min;
        int index;
        return new Build(2);
    }

}
