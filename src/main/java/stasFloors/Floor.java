package stasFloors;

/**
 * Created by Пользователь on 29.05.2017.
 */
public class Floor {
    private int [] rooms;
    private int maxRooms;
    private int currentRoom = 0;

    public int[] getRooms() {
        return rooms;
    }

    @Override
    public String toString() {
        String outPut = "";
        for (int i = 0; i < maxRooms ; i++) {
            outPut+= " " + rooms[i];
        }
        return outPut;
    }
    public Floor(int maxRooms) {
        this.maxRooms = maxRooms;
        rooms = new int[maxRooms];
    }
    public boolean addRoom(int numRoom){
        if (currentRoom < maxRooms){
            rooms[currentRoom] = numRoom;
            currentRoom++;
            return true;
        } else {
            return false;
        }
    }
}
