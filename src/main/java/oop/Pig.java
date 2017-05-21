package oop;

public class Pig extends Pet {
    public Pig() {

        setWeight(5000 + (int)(Math.random()*5000));

    }

    @Override
    String voice() {
        return "хрю";
    }
}
