package stasFloors;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

/**
 * Created by Пользователь on 29.05.2017.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("введите кол-во этажей, чтобы комнаты заполнялись полностью");
        int countRooms = Integer.parseInt(bufferedReader.readLine());
        Random random = new Random();
        System.out.println("какую комнату хотите найти");
        Building building = new Building();
        int qwerty = Integer.parseInt(bufferedReader.readLine());
        building.setFloors(countRooms);
        for (Floor floor :  building.getFloorses()) {
            System.out.println(floor.toString());
        }
        System.out.println(building.getFloorCounter());
        System.out.println(building.getFloorbyRoom(qwerty));
    }
}
