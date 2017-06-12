package uRiseLessons.collection;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

    static {
        storage.add(new Human("Иванов", 123));
        storage.add(new Human("Петров", 456));
        storage.add(new Human("Сидоров", 678));
        storage.add(new Human("Jones", 9110));
        storage.add(new Human("Miller", 23456));
    }

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            while (true) {
                System.out.println("Введите команду для телефонного справочника:");
                String command = br.readLine();
                if (command.toLowerCase().equals("exit")) {
                    System.out.println("Выходим из телефонного справочника");
                    break;
                } else if (command.toLowerCase().equals("list")) {
                    System.out.println("Список людей в телефонном справочнике");
                    Collections.sort(storage);
                    for (Human h : storage) {
                        System.out.println(h.toString());
                    }
                } else if (command.toLowerCase().equals("add")) {
                    while (true) {
                        System.out.println("Введите фамилию");
                        String lastName = br.readLine();
                        System.out.println("Введите номер телефона");
                        String phoneNumber = br.readLine();
                        if (checkWithRegexp("^[A-Z|А-Я][a-z|а-я]{1,19}", lastName) && checkWithRegexp("^((8|\\+7)[\\- ]?)?(\\(?\\d{3}\\)?[\\- ]?)?[\\d\\- ]{7,10}$", phoneNumber)) {
                            //Зеленый свет для этих номеров
//                            +79261234567
//                            89261234567
//                            79261234567
//                            +7 926 123 45 67
//                            8(926)123-45-67
//                            123-45-67
//                            9261234567
//                            79261234567
//                            (495)1234567
//                            (495) 123 45 67
//                            89261234567
//                            8-926-123-45-67
//                            8 927 1234 234
//                            8 927 12 12 888
//                            8 927 12 555 12
//                            8 927 123 8 123
                            long phone = Long.parseLong(phoneNumber);
                            Human human = new Human(lastName, phone);
                            boolean needAdd = true;
                            for (Human h : storage) {
                                if (h.getName().equals(human.getName())) {
                                    System.out.println("такой человек уже есть");
                                    needAdd = false;
                                    break;
                                }
                            }
                            if (needAdd) {
                                storage.add(human);
                                System.out.println("Добавлен человек");
                            }
                            break;
                        } else {
                            System.out.println("не подошло, попробуйте снова");
                        }
                    }
                } else if (command.toLowerCase().equals("search")) {
                    while (true) {
                        System.out.println("Введите фамилию, по которой будем искать");
                        String searchName = br.readLine();
                        if (!searchName.matches("^[A-Z|А-Я][a-z|а-я]{1,19}")) {
                            System.out.println("Введите имя, начинающееся с заглавной буквы");
                            continue;
                        }
                        for (Human h : storage) {
                            if (searchName.equals(h.getName())) {
                                System.out.println("Ваше имя найдено" + h.toString());
                            }
                        }
                    }
                } else if (command.toLowerCase().equals("remove")) {
                    String nameForRemove = br.readLine();
                    for (Human h : storage) {
                        if (nameForRemove.equals(h.getName())) {
                            storage.remove(h);
                            System.out.println("запись удалена");
                        }
                    }
                } else {
                    System.out.println("Такой команды нет, попробуйте снова");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static boolean checkWithRegexp(String patt, String s) {
        String pattern = patt;
        String text = s;
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);
        return m.matches();
    }
}
