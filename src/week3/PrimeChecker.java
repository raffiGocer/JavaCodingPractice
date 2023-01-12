package week3;

public class PrimeChecker {



        public static void main(String[] args) {
            int number = 29; //initialize the number to be checked
            if (number <= 1) {
                System.out.println(number + " is not a prime number."); //if number is less than or equal
                // to 1 it's not prime
            }
            if (number == 2 || number == 3) {
                System.out.println(number + " is a prime number."); //2 and 3 are prime numbers
            }
            if (number % 2 == 0 || number % 3 == 0) {
                System.out.println(number + " is not a prime number."); //if divisible by 2 or 3 it's not prime
            }
            for (int i = 5; i * i <= number; i += 6) {
                if (number % i == 0 || number % (i + 2) == 0) {
                    System.out.println(number + " is not a prime number."); //check if divisible
                    // by any number between 5 and sqrt(number) with increment of 6
                }
            }
            System.out.println(number + " is a prime number."); //if not divisible by any of
            // the above then it's prime
        }
    }


