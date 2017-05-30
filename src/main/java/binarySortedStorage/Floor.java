package binarySortedStorage;

import java.util.ArrayList;
import java.util.List;

public class Floor {
    private int roomCount;
    private List<Room> rooms;
    private int id = (int)(Math.random()+4);

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Floor(int roomCount) {
        this.roomCount = roomCount;
        rooms = new ArrayList<>(roomCount);
    }

    public void add (Room room){
       if(!isThereSuchRoom(room)) {
           rooms.add(room);

       }else{
           room = new Room((int)(id + Math.random()*id));
           add(room);
       }

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

                return true;
            }
        }
        return false;
    }
}
