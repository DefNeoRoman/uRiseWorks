package arrays;

public class Inversion {
    public static void main(String[] args) {
        String[] arr ={"красный","оранжевый","желтый","зеленый","голубой","синий","фиолетовый"};

      reverse(arr);
        for(String s :arr){
            System.out.println(s);
        }

    }
    public static void reverse(String[] a){

       int iter = a.length - a.length/2;
        int comeBack = a.length-1;
        for(int j =0; j<iter; j++){
            String s1 = a[j];
            String s2 = a[comeBack];
            a[j] = s2;
            a[comeBack] = s1;
            comeBack--;
        }

    }
}
