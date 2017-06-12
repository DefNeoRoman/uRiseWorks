package uRiseLessons.simpleNumbers;

public class Main {
    public static void main(String[] args) {
        final int capacity = 100000;
        int primeCount = 1;
        System.out.println(2);
        for (int i = 3; i < capacity; i += 2) {
            boolean isPrime = true;
            for (int j = 3; j < Math.sqrt(i) + 1; j += 2) {
                //for (int j = 3; j < i; j += 2) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(i);
                primeCount++;
            }
        }
        System.out.println(" Primes: " + primeCount);
    }
}
