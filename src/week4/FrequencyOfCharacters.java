package week4;

public class FrequencyOfCharacters {

    public static void main(String[] args) {
        System.out.println(frequencyOfChars("AAABBCCCCDDEEEEFF"));
    }

    public static String frequencyOfChars(String input) {
        // Create an empty string to store the result
        String result = "";

        // Iterate through each character in the input string
        for (int i = 0; i < input.length(); i++) {
            // Initialize a count variable to keep track of the frequency of the current character
            int count = 0;

            // Iterate through the input string again to count the frequency of the current character
            for (int j = 0; j < input.length(); j++) {
                // If the current character is equal to the character at the current index, increment the count
                if (input.charAt(i) == input.charAt(j)) {
                    count++;
                }
            }

            // Check if the current character is the first occurrence of that character in the input string
            if (input.indexOf(input.charAt(i)) == i) {
                // If so, add the character and its frequency to the result string
                result += input.charAt(i) + "" + count;
            }
        }
        return result;
    }
}
