package uRiseLessons.binarySortedStorage;

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

    public Floor() {
    }

    public Floor(int roomCount) {
        this.roomCount = roomCount;
        rooms = new ArrayList<>(roomCount);
    }

    public Floor(int roomCount, int id) {
        rooms = new ArrayList<>(roomCount);
        this.roomCount = roomCount;
        this.id = id;
    }

    public void add(Room room) {
        rooms.add(room);
    }

    public int getSize() {
        return rooms.size();
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public boolean isThereSuchRoom(Room room) {
        for (Room r : rooms) {
            if (room.getId() == r.getId()) {
                return true;
            }
        }
        return false;
    }
}
