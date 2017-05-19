package arrays;

public class Inversion {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int[] v = new int [8];
        int count = 0;
        for(int i = arr.length-1; i>=0; i--){
            v[count] = arr[i];
            count++;
        }
        for (int a:v){
            System.out.print(a+" ");
        }
    }
}
