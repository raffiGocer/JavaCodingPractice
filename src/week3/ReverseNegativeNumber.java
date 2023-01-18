package week3;

public class ReverseNegativeNumber {

    public static void main(String[] args) {

        int num = -9;
        String str = Integer.toString(num);
        String reversedStr = new StringBuilder(str).reverse().toString();
        int reversedNum = Integer.parseInt(reversedStr);
        System.out.println(reversedNum); // Output: -5

    }

/*
        public static int reverse(int number) {
            int reversed = 0;
            boolean isNegative = false; //check if the number is negative
            if (number < 0) {
                isNegative = true;
                number = -number; //if the number is negative make it positive
            }
            while (number != 0) {
                reversed = reversed * 10 + number % 10; // Get the last digit of the number and
                // add it to reversed number
                number /= 10; //remove the last digit from the number
            }
            return isNegative ? -reversed : reversed; // return the reversed number with the appropriate sign
        }
        public static void main(String[] args) {
            int number = -123;
            int reversed = reverse(number);
            System.out.println("The reversed number is: " + reversed);


 */

        }



