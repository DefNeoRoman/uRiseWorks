package cycles;

public class Additional {
    public static void main(String[] args) {
        // есть четверо братьев разных возрастов
        // сумма каждых трех 30 32 32 35
        // найти возраст каждого брата
        int[] varSum = {30, 32, 35};
        int minAge = 1;
        int maxAge = 33;
        for (int i = minAge; i <= maxAge; i++) {
            for (int j = minAge; j <= maxAge; j++) {
                for (int k = minAge; k <= maxAge; k++) {
                    for (int l = minAge; l <= maxAge; l++) {
                        int sum123 = i + j + k;
                        int sum234 = j + k + l;
                        int sum124 = i + j + l;
                        int sum134 = i + k + l;
                        int[] arr = {sum123, sum234, sum124, sum134};
                        for (int q : arr) {
                            for (int r : varSum) {
                                if (q == r) {
                                    System.out.println("Первый возраст " + i);
                                    System.out.println("Второй возраст " + j);
                                    System.out.println("Третий возраст " + k);
                                    System.out.println("Четвертый возраст " + l);
                                    System.out.println("Угадана сумма" + q);
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
