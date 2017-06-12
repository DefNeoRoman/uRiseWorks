package answersToInterview.dependencyInjection;

import answersToInterview.dependencyInjection.classes.DefaultEngineImpl;
import answersToInterview.dependencyInjection.classes.DefaultImplCar;
import answersToInterview.dependencyInjection.interfaces.ICar;

public class App {
    public static void main(String[] args) {
        ICar car  = new DefaultImplCar(new DefaultEngineImpl()); // Вот инъекция зависимости, когда мы можем в конструктор передать разный тип двигателя
        // Установка подачи топлива в двигатель делается через класс Car(проявление инъекции зависимоти)
        System.out.println(car.getSpeed());
        car.setPedalPressure(50);
        System.out.println(car.getSpeed());
    }
}
