package uRiseLessons.methods;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Integer> intes = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            intes.add(i);
        }
        intes.remove(5);
        System.out.println(intes.get(0));
        intes.forEach(System.out::println);
    }
}
