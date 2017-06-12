package uRiseLessons.binarySortedStorage;

import java.util.ArrayList;
import java.util.List;

public class Build {

    private List<Floor> floors;
    private int numCurrentFloor = 0;
    private int currentCountRooms = 1;
    private Floor curFloor = new Floor(currentCountRooms);

    public List<Floor> getFloors() {
        return floors;
    }

    public Build() {
        floors = new ArrayList<>();
    }
    public void addFloor(Floor floor){
        floors.add(floor);
    }
    public void whatAppartmentsExist(){
        int count = 1;
        for (Floor f: floors){
            for (Room r:f.getRooms()){
                System.out.print(r.toString());
            }
            System.out.println();
            System.out.println("Этаж №" + count);
            System.out.println("===========================");
            count++;
        }
    }
    public void addRoom(Room room){


        if (numCurrentFloor == currentCountRooms) {
            numCurrentFloor = 0;
            currentCountRooms++;
            curFloor = new Floor(currentCountRooms);
        }
        if (curFloor.getSize() < currentCountRooms) {
            curFloor.add(room);
        }
        if (curFloor.getSize() == currentCountRooms) {
            addFloor(curFloor);
            curFloor = new Floor(currentCountRooms);
            numCurrentFloor++;

        }
   }
}
