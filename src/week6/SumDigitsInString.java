package week6;

import java.util.Scanner;

public class SumDigitsInString {


        public static void main(String[] args) {
            // Create a Scanner object to read input from the user

            Scanner input = new Scanner(System.in);

            System.out.print("Enter a string: ");
            String str = input.nextLine();
            // Call the sumOfDigits method and print the result

            System.out.println("Sum of digits in the string: " + sumOfDigits(str));
        }

        /**
         * Returns the sum of the digits in a string
         * parameter str goes as input string in the method

         */
        public static int sumOfDigits(String str) {
            int sum = 0;
            // Iterate through the string and add up the digits

            for (int i = 0; i < str.length(); i++) {
                // Check if the current character is a digit

                if (Character.isDigit(str.charAt(i))) {
                    // If it is a digit, get numeric value and add the value to the sum

                    sum += Character.getNumericValue(str.charAt(i));
                }
            }
            return sum;
        }
    }


