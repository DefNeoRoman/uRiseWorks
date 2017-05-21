package incapsulation;

import oop.*;

public class Cat implements Pet {

    private int originWeight;
    private int weight;
    private int maxWeight;
    private int minWeight;

    public Cat(int originWeight) {
        this.originWeight = originWeight;
        this.weight = originWeight;
        this.maxWeight = 10000;
        this.minWeight = 100;
    }

    public Cat() {
        this(1000 + (int) (Math.random() * 2000));
    }
    private  boolean isAlive(){

        if(toString().equals("alive") || toString().equals("sleep")){
            return true;
        }
        return false;
    }
    private boolean isAwake(){
        if(!toString().equals("exploded") || !toString().equals("dead") || !toString().equals("sleep") || toString().equals("alive")){
            return true;
        }
        return false;

    }
    @Override
    public void voice() {

    }

    @Override
    public void feed(int amount) {

    }

    @Override
    public void water(int amount) {

    }

    @Override
    public void toilet() {

    }

    @Override
    public String toString() {

        String status = "alive";
        if(weight > maxWeight){
            status = "exploded";
        }
        if (weight < minWeight){
            status = "dead";
        } if (weight > maxWeight-originWeight/2){
            status = "sleep";
        }
        return status;
    }
}
