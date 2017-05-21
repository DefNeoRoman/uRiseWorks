package arrays;

public class ChessBoard {
    public static void main(String[] args) {
        int boardSize = 9;
        StringBuilder line = new StringBuilder("");
        for (int i = 0; i < boardSize; i++) {
            line.append("___");
        }
        String[][] chessBoard = new  String[boardSize][boardSize];
        for (int i = 0; i < chessBoard.length; i++) {
            System.out.print("|");
            for (int j = 0; j < chessBoard[i].length; j++) {
                chessBoard[i][j] = "" +  (char)(j+'a') + (boardSize-i) + "|";
                System.out.print(chessBoard[i][j]);
            }
            System.out.println("\n" + line);
        }

    }
}
