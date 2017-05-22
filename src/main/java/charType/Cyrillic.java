package charType;

public class Cyrillic {
    public static void main(String[] args) {

        char a = 'а';
     
        int end = (int)a+40;
        for (int i = (int)a; i < end; i++) {
            System.out.println((char)i);
        }
    }
}
