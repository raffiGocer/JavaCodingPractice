package week6;

public class MaxArray {

    // Method to find the maximum number in an int array
    public static int findMax(int[] arr) {
        // Initialize the maximum number as the first element of the array
        int max = arr[0];

        // Loop through the rest of the elements in the array
        for (int i = 1; i < arr.length; i++) {
            // If the current element is greater than the maximum, update the maximum
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // Return the maximum number
        return max;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int max = findMax(numbers);
        System.out.println("The maximum number is: " + max);
    }

}
