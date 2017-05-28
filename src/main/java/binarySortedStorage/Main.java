package binarySortedStorage;
// на вход подается количество комнат
// нужно определить количество этажей
// комнаты на этажи заводятся в случайном порядке
// количество комнат на каждом этаже одинаково
// то есть id - это всегда случайное число
//нужно отсортировать от самого нижнего этажа
//до самого высокого этажа
// по порядку
// с помощью бинарного поиска вставками
// по номеру комнаты определить этаж, на котором находится комната
public class Main {
    public static void main(String[] args) {
        Composer composer = new Composer();
        composer.build(115);
        Build build = composer.getBuild();
        build.whatAppartmentsExist();
    }
}
