package uRiseLessons.cycles;

public class Main {
    public static void main(String[] args) {
        for (int i = 10; i > 0; i--) {
            System.out.println(i + " негритят сидело за столом!");
            if (i == 1) {
                System.out.println("один ушел никого не осталось, все негритята ушли");
                break;
            }
            System.out.println("один ушел " + "осталось " + (i - 1) + "негритят");
        }
    }
}
