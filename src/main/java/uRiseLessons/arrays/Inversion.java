package uRiseLessons.arrays;

public class Inversion {
    public static void main(String[] args) {
        String[] arr ={"красный","оранжевый","желтый","зеленый","голубой","синий","фиолетовый","ультрафиолетовый"};
      reverse(arr);
        for(String s :arr){
            System.out.println(s);
        }
    }
    public static void reverse(String[] arr){
        for(int j =0; j<arr.length/2; j++){
            String tmp = arr[j];
            arr[j] = arr[arr.length-1-j];
            arr[arr.length-1-j] = tmp;
        }
    }
}
