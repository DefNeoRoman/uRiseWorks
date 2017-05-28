package newSortRooms;

import java.util.ArrayList;
import java.util.List;

public class Building {
    List<Floor> floors = new ArrayList<>();
    int size = 0;
    int capacityFloors = 1;
    int numinCurCapacity = 0;

    public void addRoom(Room room){
        if(size == 0){
            Floor floor = new Floor(capacityFloors);
            floor.addRoom(room);
            addFloor(new Floor(capacityFloors));
            capacityFloors++;
            size++;

        }else {
            if(floors.get(size - 1).addRoom(room)){
                return;
                //System.out.println("added");
            }else{
                if(numinCurCapacity < capacityFloors) {
                    Floor floor = new Floor(capacityFloors);
                    floor.addRoom(room);
                    floors.add(floor);
                    numinCurCapacity++;
                }else{
                    numinCurCapacity = 0;
                    capacityFloors++;
                    addRoom(room);
                }
            }
        }


    }
    public void addFloor(Floor floor){
        floors.add(floor);
    }

    @Override
    public String toString() {
       String out = "";
        for (int i = 0; i < floors.size(); i++) {
            out += floors.get(i) + "\n";
        }
        return out;
    }
}
