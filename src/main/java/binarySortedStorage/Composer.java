package binarySortedStorage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Composer {
    private final static int TP_DEPTH = Runtime.getRuntime().availableProcessors();
    private Building building;

    public Building getBuilding() {
        return building;
    }

    public void build(int n){
        int countOfFloors = (int)Math.sqrt(n); // Количество этажей
        building = new Building(countOfFloors);
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
                building.addFloor(currentfloor);
                currentfloor = null; //Присваивать null или также каждый элемент сделать null как в ArrayList
                continue;
            }

        }
        building.addFloor(currentfloor);
        System.out.println("Здание построено");
    }
    public Building binarySort(Building building) throws Exception{
        ExecutorService service = Executors.newFixedThreadPool(TP_DEPTH);
        List<Floor> before = building.getFloors();
        List<Room> currentRoomList = new ArrayList<Room>();
        List<Future> lf = new ArrayList<Future>();
        for (Floor f: before){
            SortingTask st = new SortingTask(f);
           Future future = service.submit(st);
            lf.add(future);
        }
        for(Future f: lf){

        }
        int min;
        int index;
        return new Building(2);
    }

}
