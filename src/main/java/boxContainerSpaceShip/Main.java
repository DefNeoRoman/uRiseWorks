package boxContainerSpaceShip;

public class Main {
    public static void main(String[] args) {
       // int COUNT_OF_BOXES = Integer.parseInt(args[0]);
        int COUNT_OF_BOXES = 1000;
        int countInContainer = 0;
        int countInSpaceShip = 0;
        int spaceShips = 0;
        for (int i = 0; i < COUNT_OF_BOXES; i++) {

            if(countInSpaceShip == 11){
                countInSpaceShip = 0;
                System.out.println("Космический корабль упакован");
                spaceShips++;
            }

            if(countInContainer == 34){
                countInSpaceShip++;
                countInContainer = 0;
                System.out.println("контейнер упакован");
            }
            countInContainer++;

        }
        //Космические корабли и контейнеры
        //В каждом корабле максимум 11 контейнеров
        //В каждом контейнере максимум 34ящика
        System.out.println("количество кораблей: " + spaceShips + " осталось упаковать контейнеров: " + countInSpaceShip );
    }

}
