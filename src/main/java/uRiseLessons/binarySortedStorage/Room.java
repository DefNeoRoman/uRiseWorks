package uRiseLessons.binarySortedStorage;

public class Room implements Comparable<Room> {
    private int id;

    public Room() {
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Room room = (Room) o;
        return id == room.id;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public int compareTo(Room o) {
        return id - o.getId();
    }
}
