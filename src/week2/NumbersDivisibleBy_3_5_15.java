package week2;

public class NumbersDivisibleBy_3_5_15 {

        public static void main(String[] args) {

            // Here in this code I had to use three different loops to regroup the numbers by their divisors

            System.out.print("Divisible by 15: "); // Prints the title, it had to be outside the loop
            for (int i = 1; i <= 100; i++) { // Here I iterate the numbers between 1 and 100
                if (i % 15 == 0) { // Here the numbers are selected by the remainder op, that are divisible by 15
                    System.out.print(i + " "); // print space after each number
                }

            }
            System.out.println(); // I wanted leave a space between each group to make easier to read

            // I repeat the same cycle for the numbers that are divisible by 5 and 3

            System.out.print("Divisible by 5: ");
            for (int i = 1; i <= 100; i++) {
                if (i % 3 != 0 && i % 5 == 0 && i % 15 != 0) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();

            System.out.print("Divisible by 3: ");
            for (int i = 1; i <= 100; i++) {
                if (i % 3 == 0 && i % 5 != 0 && i % 15 != 0) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();

        }
    }

