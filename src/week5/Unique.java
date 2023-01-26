package week5;

public class Unique {


        public static void main(String[] args) {
            System.out.println(unique("AAABBBCCCDEF"));
        }

        public static String unique(String input) {
            // create a new empty string to store unique characters
            String unique = "";

            // iterate through each character in the input string
            for (int i = 0; i < input.length(); i++) {
                // check if the current character is already in the unique string
                if (!unique.contains(String.valueOf(input.charAt(i)))) {
                    // if it is not, add it to the unique string
                    unique += input.charAt(i);
                }
            }

            // return the unique string
            return unique;
        }
    }


