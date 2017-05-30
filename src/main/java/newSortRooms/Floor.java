package newSortRooms;

public class Floor {
    Room[] rooms;
    int size;
    int max;

    public Floor(int max) {
        this.max = max;
        size = 0;
        rooms = new Room[max];
    }

    public boolean addRoom(Room room){
        if(size < max){
            return false;
        }
       rooms[size] = room;
        size++;
        return true;
    }

    @Override
    public String toString() {
        String out = "";
        for (int i = 0; i < rooms.length; i++) {
            out +=  rooms[i] + " ";
        }
      
        return out;
    }
}
