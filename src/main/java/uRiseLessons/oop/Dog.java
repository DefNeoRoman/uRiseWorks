package uRiseLessons.oop;

public class Dog extends Pet {
    public Dog() {
    }

    @Override
    public int hashCode() {// hashcode посмотреть реализацию
        // реализация hashcode
        // память в java
        return super.hashCode();
    }

    @Override// правильное реализация equals и hashcode
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    String voice() {
        return null;
    }
}
