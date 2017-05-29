package stasFloors;

import java.util.ArrayList;

/**
 * Created by Пользователь on 29.05.2017.
 */
public class Building {
    private ArrayList<Floor> floorses;
    private int currentCappacity = 0; //скока комант на этаже
    private int floorInCurrentCappacity = 1;  //номер этажа в текущей -1
    private int floorCounter = 1; //счетчик всех этажей
    private int roomsCounter = 0;


    public int getFloorCounter() {
        return floorCounter;
    }

    public Building() {
        floorses = new ArrayList<>();
    }

    public ArrayList<Floor> getFloorses() {
        return floorses;
    }



    public void setFloors(int rooms) {
        floorses.clear();
        currentCappacity = 1; //скока комант на этаже
        floorInCurrentCappacity = 0;  //номер этажа в текущей -1
        floorCounter = 1; //счетчик всех этажей
        roomsCounter = 0;
        for (int i = 0; i < rooms; i++) {
            if(floorInCurrentCappacity < currentCappacity) {
                Floor floor = new Floor(currentCappacity);
                for (int j = 0; j < currentCappacity; j++) {
                    floor.addRoom(++roomsCounter);
                }
                floorses.add(floor);
                floorInCurrentCappacity++;
            }else{
                floorInCurrentCappacity = 1;
                Floor floor = new Floor(++currentCappacity);
                for (int j = 0; j < currentCappacity; j++) {
                    floor.addRoom(++roomsCounter);
                }
                floorses.add(floor);
            }
        }

    }

    public int getFloorbyRoom(int numRoom) {

        for (int i = 0; i < floorses.size(); i++) {
            for (int j = 0; j < floorses.get(i).getRooms().length; j++) {
                if (floorses.get(i).getRooms()[j] == numRoom) {
                    return i + 1;

                }
            }
        }
        return -1;
    }
}

