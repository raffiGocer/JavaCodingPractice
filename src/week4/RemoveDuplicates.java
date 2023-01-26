package week4;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

    public static void main(String[] args) {

        System.out.println(removeDup("AAABBBCCC"));
    }

    public static String removeDup(String input) {
        // Create a new HashSet to store unique characters
        HashSet<Character> set = new HashSet<>();

        // Iterate through each character in the input string
        for (int i = 0; i < input.length(); i++) {
            // Add the current character to the HashSet
            set.add(input.charAt(i));
        }

        // Create a new empty string to store the output
        String output = "";

        // Iterate through the HashSet and add each character to the output string
        for (Character c : set) {
            output += c;
        }

        return output;
    }



}
