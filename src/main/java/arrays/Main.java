package arrays;

public class Main {
    public static void main(String[] args) {
        String[]letters = {"a","b","c","d","e","f","g","h"};
        int [] numbers = {1,2,3,4,5,6,7,8};
        for (int i = numbers.length-1; i>=0; i--){
            for(int j = 0; j < letters.length; j++){
                System.out.print(letters[j] + numbers[i] + "|");
            }
            System.out.println();
        }
    }
}
