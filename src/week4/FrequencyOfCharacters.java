package week4;

public class FrequencyOfCharacters {

    public static void main(String[] args) {
        System.out.println(frequencyOfChars("AAABBCCCCDDEEEEFFFFFAAAAAA"));
    }

    public static String frequencyOfChars(String str) {
        // Create an empty string to store the result
        String result = "";

        // Iterate through each character in the str string
        for (int i = 0; i < str.length(); i++) {
            // Initialize a count variable to keep track of the frequency of the current character
            int count = 0;

            // Iterate through the str string again to count the frequency of the current character
            for (int j = 0; j < str.length(); j++) {
                // If the current character is equal to the character at the current index, increment the count
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }

            // Check if the current character is the first occurrence of that character in the str string
            if (str.indexOf(str.charAt(i)) == i) {
                // If so, add the character and its frequency to the result string
                result += str.charAt(i) + "" + count;
            }
        }
        return result;
    }
}
