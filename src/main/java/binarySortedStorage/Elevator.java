package binarySortedStorage;

import java.util.List;

public class Elevator {
    public Elevator() {
    }

    public static Floor whatFloorThisRoom(Build build, int id) {
        Floor searchFloor = null;
        try {
            Room searchRoom = new Room(id);
            List<Floor> floors = build.getFloors();

            for (Floor floor : floors) {
                List<Room> roomList = floor.getRooms();
                for (Room room1 : roomList) {
                    if (room1.equals(searchRoom)) {
                        searchFloor = floor;
                        return searchFloor;
                    }
                }
            }

        } catch (NullPointerException e) {
            System.out.println("This Room not generate");
        }

        return searchFloor;

    }
}
