package recursion;

/**
 * Created by Пользователь on 26.05.2017.
 */
public class Faktorial {
    public static void main(String[] args) {
        System.out.println(recursion(3));
    }
    public static int recursion (int n){
        if (n==1){
            return 1;
        }
        return recursion(n-1)*n;
    }
}
