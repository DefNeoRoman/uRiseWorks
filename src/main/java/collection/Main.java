package collection;

import java.util.*;
//Fifo пример простой очереди
//Есть телефонный справочник с тезками
//нужно вводить с клавиатуры шаблон
//Имя должно начинаться с заглавной буквы
//имя от 2 до 19 буквы
// номер телефона 10 цифп
//Ввести с клавиатуры либо номер либо имя
//если это номер - то значит просит ввести имя
//он может найти или не найти
//нужно команду лист, которая показывает все отсортировано по имени
//Если тезка, то такой человек есть
//чтобы все работало в режиме командной строки
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
