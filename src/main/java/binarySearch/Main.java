package binarySearch;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int capacity = 143_000_000;
        Scanner scanner = new Scanner(System.in);
        int atempt = 0;
        int min = 0;
        int max = capacity;
//79000
        while(true){

            int answer = min+((max-min)/2);

            System.out.println("Называю число" +answer + ", 0 если угадал, 1 если больше,2 если меньше");
            int userAnswer = scanner.nextInt();
            if(userAnswer == 0){
                System.out.println("Я угадал с попытки №" + atempt);
            } else if(userAnswer == 1){
                min = answer;
                atempt++;
            } else if (userAnswer == 2){
                max = answer;
                atempt++;
            }else {
                System.out.println("некорректный ввод");
            }

        }

    }
}
