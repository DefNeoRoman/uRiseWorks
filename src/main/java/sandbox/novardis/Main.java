package sandbox.novardis;

import java.util.Arrays;

public class Main {
    static String a = new String ("hello");
    static String b = new String(a);
    static String c= a;
    static char[] d = {'h','e','l','l','o'};



    public static void main(String[] args) {
        System.out.println(a == "hello"); // разные ссылки на объекты
        System.out.println(a == b); // была создана новая ссылка
        System.out.println(a == c); // одинаковые ссылки
        System.out.println(a.equals(b)); // эквивалентность не по ссылкам, а по содержимому
        System.out.println(Arrays.equals(a.toCharArray(), d));
    }
    public static void recur(int a){

        if(a<=100){
            System.out.println("a=" +a);
            recur(++a);
            System.out.println("a="+ a);
        }
    }
}
