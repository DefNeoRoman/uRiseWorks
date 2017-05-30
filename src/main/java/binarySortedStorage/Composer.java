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
    private int currentRoom = 1; //текущая комната
    private int numCurrentFloor = 0;
    private Floor currentFloor;         //текущий этаж

    public Build getBuild() {
        return build;
    }

    public void build(int n){
    build = new Build();
    currentFloor = new Floor(currentCountRooms);
    // numCurrentFloor
    // currentCountRooms

        for (int i = 0; i < n; i++) {
            Room room = new Room((int)(i + Math.random()*i));
            if (numCurrentFloor == currentCountRooms){
                numCurrentFloor = 0;
                currentCountRooms++;
                currentFloor = new Floor(currentCountRooms);
              }
            if(currentFloor.getSize() < currentCountRooms){
                currentFloor.add(room);


            }if (currentFloor.getSize()== currentCountRooms){
                build.addFloor(currentFloor);
                currentFloor = new Floor(currentCountRooms);
                numCurrentFloor++;

              continue;
            }
        }

    }
    public Build binarySort(Build build) throws Exception{
       return new Build(2);
    }

}
