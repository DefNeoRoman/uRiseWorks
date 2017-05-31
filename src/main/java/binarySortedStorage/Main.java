package binarySortedStorage;

public class Main {
    public static void main(String[] args) throws Exception{
        Composer composer = new Composer();
        composer.build(50);
        Build build = composer.getBuild();
        Build build2 = composer.binarySort(build);
        build2.whatAppartmentsExist();
        Floor searchFloor = Elevator.whatFloorThisRoom(build2,5);
        System.out.println("This Room is in" + searchFloor.getId() + "floor");
    }
}
