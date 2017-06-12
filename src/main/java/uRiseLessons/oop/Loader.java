package uRiseLessons.oop;


import java.util.Arrays;
import java.util.Random;

public class Loader {
    public static void main(String[] args) {
        int capacity = 100;
        Random r = new Random();
        int countOfPig = 0;
        Pet[] pets = new Pet[capacity];
        for (int i = 0; i < capacity ; i++) {
            if(r.nextInt(capacity)> 50){
                pets[i] = new Pig();
            }else{
                pets[i] = new Dog();
            }
        }
        Arrays.sort(pets);
        for (int i = 0; i < pets.length ; i++) {
            System.out.println(pets[i].getWeight());
            if (pets[i].voice().equals("хрю")){
                countOfPig++;
            }
        }
        System.out.println(countOfPig);

    }

}
