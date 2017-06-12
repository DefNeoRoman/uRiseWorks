package answersToInterview.incapsulation;

public interface Pet {
    void voice(); // Печатает в консоль мяу и теряет 1 грамм веса

    void feed(int amount); //Увеличивает текущий вес на amount

    void water(int amount); //Увеличивает текущий вес на amount

    void toilet();//теряет от 50 до 150 грамм веса

}
