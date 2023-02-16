package week7;

public class SortArrayAscending {

    public static int[] sortArray(int[] arr) {
        // Iterate through the array
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                // If the current element is greater than the next element, swap them
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        // Return the sorted array
        return arr;
    }

}
