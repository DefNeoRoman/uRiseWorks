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
                        if(sum123 == 30 && sum234 == 32 && sum134 == 32 && sum124 == 35){
                            System.out.println("Возраст 1 брата " + i);

                            System.out.println("Возраст 2 брата " + j);

                            System.out.println("Возраст 3 брата " + k);
                            
                            System.out.println("Возраст 4 брата " + l);
                        }
                    }
                }
            }
        }
    }
}
