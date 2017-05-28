package recursion;

/**
 * Created by Пользователь on 26.05.2017.
 */
public class FromOneToN {
    public static void main(String[] args) {
        System.out.println(recursion(5));
    }
    public static String recursion(int n){
        if (n==1){
            return "1";
        }
        return recursion(n-1)+ " " +n;
    }
}
