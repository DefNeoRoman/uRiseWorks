package answersToInterview.recursion;

/**
 * Created by Пользователь on 26.05.2017.
 */
public class PowerOfTwo {
    public static void main(String[] args) {
        double n= 65;
        if(recursion(n) == 1){
            System.out.println("Yes");
        }else {
            System.out.println("no");
        }
    }
    public static int recursion(double n){

        if(n==1){
            return 1;
        } else if (n>1 && n<2){
            return 0;
        }else {
            return recursion(n/2);
        }

    }
}
