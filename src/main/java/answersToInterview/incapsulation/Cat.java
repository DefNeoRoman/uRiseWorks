package answersToInterview.incapsulation;



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

    public int getMaxWeight() {
        return maxWeight;
    }

    public int getMinWeight() {
        return minWeight;
    }

    public int getOriginWeight() {
        return originWeight;
    }

    public int getWeight() {
        return weight;
    }

    public Cat(Cat cat) {
        this.originWeight = cat.getOriginWeight();
        this.weight = cat.getWeight();
        this.maxWeight = 10000;
        this.minWeight = 100;
    }

    public Cat() {
        this(1000 + (int) (Math.random() * 2000));
    }
    public static Cat cloneCat(Cat donor){
        Cat cat = new Cat(donor);
        return cat;
    }
    public Cat catClone(){
        return cloneCat(this);

    }
    private  boolean isAlive(){

        if(toString().equals("alive") || toString().equals("sleep")){
            return true;
        }
        return false;
    }
    private boolean isAwake(){
        if(toString().equals("alive")){
            return true;
        }
        return false;

    }
    private boolean changeWeight(int amount){
        if(isAwake()){

            weight+=amount;
            return true;
        }
       return  false;

    }
    @Override
    public void voice() {

       if(changeWeight(-1)){
            System.out.println("мяу");
        } else {
           System.out.println("Кот не может сделать это");
        }

    }

    @Override
    public void feed(int amount) {
        if(!changeWeight(amount)){
            System.out.println("Кот не может сделать это");
        }

    }

    @Override
    public void water(int amount) {
        if(!changeWeight(amount)){
            System.out.println("Кот не может сделать это");
        }
    }

    @Override
    public void toilet() {
        if(!changeWeight(-(50 + (int)(Math.random()*100)))){
            System.out.println("Кот не может сделать это");
        }else {
            System.out.println("Кот сходил в туалет");
        }

    }

    @Override
    public String toString() {

        String status = "alive";
        if(weight > maxWeight){
            status = "exploded";
        }
        if (weight < minWeight){
            status = "dead";
        } if (weight > maxWeight-originWeight/2 && !(weight<minWeight+50)){
            status = "sleep";
        }
        return status;
    }
}
