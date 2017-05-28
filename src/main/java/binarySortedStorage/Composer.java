package binarySortedStorage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Composer {
    private final static int TP_DEPTH = Runtime.getRuntime().availableProcessors();
    private Build build;

    public Build getBuild() {
        return build;
    }

    public void build(int n){
        int countOfFloors = (int)Math.sqrt(n);
        build = new Build(countOfFloors);
        // берем создаем комнаты и кладем в каждый этаж
        Floor currentfloor = null;
        for (int i = 0; i < n ; i++) {
            Room room = new Room((int)(i + Math.random()*i)); // это просто формула из головы, чтобы потом сортировать можно было
            if(currentfloor == null){
                currentfloor = new Floor(countOfFloors);
            }
            if(!currentfloor.isThereSuchRoom(room)){
                currentfloor.add(room);
            }else {
                i--;
            }

             if(currentfloor.getSize() == countOfFloors){
                build.addFloor(currentfloor);
                currentfloor = null; //Присваивать null или также каждый элемент сделать null как в ArrayList
                continue;
            }

        }
        build.addFloor(currentfloor);
        System.out.println("Здание построено");
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
