package uRiseLessons.oop;


public abstract class Pet implements Comparable<Pet> {
    private int weight;

    abstract String voice();

    @Override
    public int compareTo(Pet o) {

        if(weight > o.getWeight()) return 1;
        else if(weight == o.getWeight()) return 0;
        else return -1;
    }

    public int getWeight() {
        return weight;
    }

    protected void setWeight(int weight) {
        this.weight = weight;
    }

}
