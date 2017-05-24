package collection;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Пользователь on 24.05.2017.
 */
// Телефонная книга
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
public class PhoneBook {
    private static List<Human> storage = new ArrayList<>();
    public static void main(String[] args) {

        try ( BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){

            System.out.println("Введите команду для телефонного справочника:");
            while (true) {
                String command = br.readLine();
                if (command.toLowerCase().equals("exit")) {
                    break;
                }
                if (command.toLowerCase().equals("list")){

                }
                if (command.toLowerCase().equals("add")) {
                    while(true){
                        System.out.println("Введите фамилию");
                        String lastName = br.readLine();
                        System.out.println("Введите номер телефона");
                        int phoneNumber = Integer.parseInt(br.readLine());
                        if(lastName.matches("A-Z")){
                            System.out.println("Regular expression is right");
                            Human human = new Human(lastName,phoneNumber);
                            storage.add(human);
                            break;
                        } else {
                            System.out.println("не подошло");
                        }

                    }





                }if(command.toLowerCase().equals("search")){
                    System.out.println("Введите фамилию, по которой будем искать");
                    while (true){

                    }

                }

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
