package uRiseLessons.probabilityDice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    //Какая сумма баллов двух игральных костей выпадает чаще всего
    public static void main(String[] args) throws IOException {
        Map<Integer, Integer> storage = new TreeMap<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //количество бросков кости
        while (true) {
            System.out.println("введите количество бросков кости");
            String console = br.readLine();
            if (console.matches(".*[a-zA-Z].*")) {
                System.out.println("Введите цифру, нельзя вводить буквы");
                continue;
            } else {
                int boneThrow = Integer.parseInt(console);
                for (int i = 0; i < boneThrow; i++) {
                    int boneResult1 = (int) (1 + Math.random() * 6);
                    int boneResult2 = (int) (1 + Math.random() * 6);
                    int boneResult = boneResult1 + boneResult2;
                    Integer count = storage.get(boneResult);
                    storage.put(boneResult, count == null ? 1 : count + 1);
                }
            }
            System.out.println(storage.toString());
            Integer maxValue = storage.values().stream().max((Integer::compareTo)).get();
            Integer searchBone = 0;
            for (Integer i : storage.keySet()) {
                if (maxValue.equals(storage.get(i))) {
                    searchBone = i;
                }
            }
            System.out.println("наибольшее количество совпадений: " + searchBone + "-" + maxValue);
            break;
        }
    }
}
