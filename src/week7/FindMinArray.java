package week7;

public class FindMinArray {

    public static int findMin(int[] arr) {
        // Set the first element of the array as the current minimum
        int min = arr[0];

        // Iterate through the array starting from the second element
        for (int i = 1; i < arr.length; i++) {
            // If the current element is less than the current minimum, update the minimum
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        // Return the minimum number
        return min;
    }

}
