package newSortRooms;

public class Room {
    private Integer number;

    public Room(Integer number) {
        this.number = number;
    }
    @Override
    public String toString() {
        return number+"";
    }
}
