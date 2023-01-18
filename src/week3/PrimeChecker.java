package week3;

public class PrimeChecker {


    // This code checks if a given number is prime
    public static boolean isPrime(int num) {
        // return false for numbers less than or equal to 1
        if (num <= 1) {
            return false;
        }
        // check if the number is divisible by any number between 2 and itself
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        // if the number is not divisible by any number, it is prime
        return true;
    }

    public static void main(String[] args) {
        int num = 37;
        // check if the given number is prime
        if (isPrime(num)) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
}

