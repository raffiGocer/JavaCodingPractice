package week5;

public class ReverseString {


        public static void main(String[] args) {
            // Store the original string
            String original = "Hello World";

            // Create an empty string to store the reversed string
            String reversed = "";

            // Iterate through the original string in reverse order
            for (int i = original.length() - 1; i >= 0; i--) {
                // Add the current character to the reversed string
                reversed += original.charAt(i);
            }

            // Print the original and reversed strings
            System.out.println("Original String: " + original);
            System.out.println("Reversed String: " + reversed);
        }
    }

