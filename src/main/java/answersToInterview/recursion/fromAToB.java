package answersToInterview.recursion;

/**
 * Created by Пользователь on 26.05.2017.
 */
public class fromAToB {
    public static void main(String[] args) {
        System.out.println(recursion(5,10));
        System.out.println(recursion(50,10));
    }
    public static String recursion(int a, int b){
        if(a>b){
            if(a==b){
                return Integer.toString(a);
            }
            return a + " " + recursion(a-1,b);
        } else {
            if (a==b){
                return Integer.toString(a);
            }
            return a + " " + recursion(a+1,b);
        }
    }
}
