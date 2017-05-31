package binarySortedStorage;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("how many rooms will be in the building?");
            int rooms = Integer.parseInt(bufferedReader.readLine());
            Floor searchFloor = null;
            Composer composer = new Composer();
            composer.build(rooms);
            Build build = composer.getBuild();
            Build build2 = composer.binarySort(build);
            build2.whatAppartmentsExist();
            while (searchFloor == null) {
                System.out.println("What room we will looking for?");
                int whatRoom = Integer.parseInt(bufferedReader.readLine());
                searchFloor = Elevator.whatFloorThisRoom(build2, whatRoom);
            }
            System.out.println("This Room is in " + searchFloor.getId() + " floor");
        } catch (NullPointerException e) {
            System.out.println("No Generate");
        }
    }
}
