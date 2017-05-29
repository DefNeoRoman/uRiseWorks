package binarySortedStorage;

public class Room implements Comparable<Room> {
    private int id;

    public Room(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Room{" +
                "id=" + id +
                '}';
    }

    public int compareTo(Room o) {
        return id - o.getId();
    }
}
