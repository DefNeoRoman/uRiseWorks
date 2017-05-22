package charType;

public class Main {
    public static void main(String[] args) {

        int boardSize = 8;
       int whiteCell = 9989;
        int blackCell = 9724;
        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize ; j++) {
                if(j%2 == 1){
                    System.out.print((char) whiteCell + " ");
                }else {
                    System.out.print((char) blackCell + " ");
                }
            }
            System.out.println();
        }
    }
}
