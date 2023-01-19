package week4;

import java.util.Arrays;

public class SameLetters {


    public static void main(String[] args) {

        System.out.println(same("abc","cab"));
    }

    public static boolean same(String str1, String str2) {
        if (str1.length() != str2.length()) { //This method first checks if the two strings have the same length.
            return false; //If they do not, it immediately returns false.
        }
        //If they do, it converts the strings to arrays of characters
        char[] char1 = str1.toCharArray();
        char[] char2 = str2.toCharArray();

        //sorts the arrays
        Arrays.sort(char1);
        Arrays.sort(char2);
        //and then compares each character in the arrays
        for (int i = 0; i < char1.length; i++) {
            if (char1[i] != char2[i]) { //If all the characters match, it returns true
                return false; //Otherwise, it returns false.
            }
        }

        return true;
    }

}
