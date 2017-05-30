package newSortRooms;

public class Main {

    public static void main(String[] args) {
        Building building = new Building();
        int roomCount = 77;
        for (int i = 0; i < roomCount; i++) {
            Room room = new Room(i+i);
            building.addRoom(room);
        }
        System.out.println(building.toString());
    }
}
