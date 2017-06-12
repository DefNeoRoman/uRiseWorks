package uRiseLessons.oop;

public class Dog extends Pet {

    public Dog() {

        setWeight(1000 + (int)(Math.random()*4000));

    }

    @Override
    String voice() {
        return "гав";
    }
}
