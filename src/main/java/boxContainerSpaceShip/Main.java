package boxContainerSpaceShip;

import java.util.ArrayList;
import java.util.List;

public class Main {
    //В контейнере от 20 до 50 ящиков исправить
    //В этом же контейнере
    public static void main(String[] args) {
       // int COUNT_OF_BOXES = Integer.parseInt(args[0]);
        List<SpaceShip> fleet = new ArrayList<>();
        Container currentContainer = new Container();
        SpaceShip currentSpaceShip = new SpaceShip();
        int COUNT_OF_BOXES = 10000;
        int maxContainers = 11;
        int maxBoxes = 34;


        for (int i = 0; i < COUNT_OF_BOXES; i++) {

            Box box = new Box(i);


            if(currentSpaceShip.getSize() == maxContainers){

                System.out.println("Космический корабль упакован");
                fleet.add(currentSpaceShip);
                currentSpaceShip.clearSpaceShip();
            }

            if(currentContainer.getSize() == maxBoxes){
                currentSpaceShip.putContainer(currentContainer);

                currentContainer.clearContent();
                System.out.println("контейнер упакован");
            }
            currentContainer.putBox(box);

        }
        //Космические корабли и контейнеры
        //В каждом корабле максимум 11 контейнеров
        //В каждом контейнере максимум 34ящика
        System.out.println("количество кораблей: " + fleet.size() + " осталось упаковать контейнеров: " + currentSpaceShip.getSize() );
    }

}
