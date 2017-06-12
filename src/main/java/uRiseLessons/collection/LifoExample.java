package uRiseLessons.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LifoExample {
    public static void main(String[] args) {
        //гараж
        int capacity = 5;

        Scanner scanner = new Scanner(System.in);

        List<String> garage = new ArrayList<>();

        while (true) {
            String command = scanner.nextLine();

            if (command.toLowerCase().equals("exit")) {
                break;
            }
            if (command.toLowerCase().equals("list")){
                garage.forEach(System.out::println);
            }
            if(command.toLowerCase().equals("exitlast")){
                if(garage.size() == 0){
                    System.out.println("Garage is empty");
                    continue;
                }
                System.out.println("Выехала машина" + garage.remove(garage.size()-1));

            }
            if (command.toLowerCase().equals("exitall")){
                if(garage.isEmpty()){
                    break;
                }
                System.out.println();
                for (int i = 0; i < capacity; i++) {
                    System.out.println("Car with number " + garage.remove(garage.size()-1) + " has left");
                }
            }
            if(garage.size() < capacity){
                garage.add(command);
            } else {
                System.out.println("Garage is full");
            }

        }
    }
}
