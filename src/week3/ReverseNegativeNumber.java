package week3;

public class ReverseNegativeNumber {

    public static void main(String[] args) {

        System.out.println(reverseNegativeNumber(-321));
    }

    // Method to reverse a negative number and return it as int
    public static int reverseNegativeNumber(int num) {
        // Check if the number is negative
        if (num < 0) {
            int reversedNum = 0;
            int temp = -num;
            // Iterate through each digit of the number
            while (temp > 0) {
                reversedNum = reversedNum * 10 + temp % 10;
                temp /= 10;
            }
            // Add the negative sign back to the reversed number
            reversedNum = -reversedNum;
            // Return the reversed number
            return reversedNum;
        }
        // If the number is not negative, return the original number
        return num;
    }

}

