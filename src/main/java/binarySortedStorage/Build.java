package binarySortedStorage;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayList;
import java.util.List;

public class Build {
    private int countOfFloors;
    private List<Floor> floors;

    public List<Floor> getFloors() {
        return floors;
    }

    public Build() {
        floors = new ArrayList<>();
    }

    public Build(int countOfFloors) {
        this.countOfFloors = countOfFloors;
        floors = new ArrayList<>(countOfFloors);
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
}
