package uRiseLessons.binarySortedStorage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class SortingTask implements Callable<List<Room>> {
    private Floor floor;

    public SortingTask(Floor floor) {
        this.floor = floor;
    }

    @Override
    public List<Room> call() throws Exception {
        List<Room> roomsBefore = floor.getRooms();
        List<Room> roomsAfter = new ArrayList<>();
        int y = floor.getSize();
        int answer = 0;
        int min = -1;
        int index = -1;
        while (true) {
            if (roomsBefore.size() == 0) {
                break;
            }
            for (int i = 0; i < roomsBefore.size(); i++) {
                Room room = roomsBefore.get(i);
                if (min == -1) {
                    min = room.getId();
                    index = i;
                } else if (room.getId() < min) {
                    min = room.getId();
                    index = i;
                }
            }
            roomsAfter.add(roomsBefore.get(index));
            roomsBefore.remove(index);
            index = -1;
            min = -1;

        }
        return roomsAfter;
    }
}
