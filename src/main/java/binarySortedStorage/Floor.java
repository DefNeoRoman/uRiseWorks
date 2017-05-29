package binarySortedStorage;

import java.util.ArrayList;
import java.util.List;

public class Floor {
    private int roomCount;
    private List<Room> rooms;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Floor(int roomCount) {
        this.roomCount = roomCount;
        rooms = new ArrayList<Room>(roomCount);
    }

    public void add (Room room){
        rooms.add(room);
    }
    public int getSize(){
        return rooms.size();
    }
    public List<Room> getRooms(){
        return rooms;
    }
    public boolean isThereSuchRoom(Room room){
        for (Room r:rooms){
            if(room.getId() == r.getId()){
                System.out.println("This room is there");
                return true;
            }
        }
        return false;
    }
}
