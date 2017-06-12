package uRiseLessons.collection;

import java.util.*;
//Fifo пример простой очереди

public class Main {
    public static void main(String[] args) {
        int capacity = 5;
        Scanner scanner = new Scanner(System.in);

        List<String> queue = new ArrayList<>();

        while (true) {
            String command = scanner.nextLine();
            if (command.toLowerCase().equals("exit")) {
                break;
            }
            if (command.toLowerCase().equals("list")){
              for (String s: queue){
                  System.out.println(s);
              }
            }
            if (queue.size() < capacity) {
                queue.add(command);
            }else {
                System.out.println("Вышел" + queue.remove(0) + "вошел" + command);
                queue.add(command);
            }

        }

    }
}
