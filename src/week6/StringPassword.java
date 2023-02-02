package week6;

public class StringPassword {

    public static boolean isValid(String password) {
        // Check if password is null or less than 6 characters in length or contains a space
        if (password == null || password.length() < 6 || password.contains(" ")) {
            return false;
        }

        // Initialize flags for each requirement
        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasSpecialChar = false;
        boolean hasDigit = false;

        // Loop through each character in the password
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);

            // Check if the character is an uppercase letter
            if (Character.isUpperCase(c)) {
                hasUpperCase = true;
            }
            // Check if the character is a lowercase letter
            else if (Character.isLowerCase(c)) {
                hasLowerCase = true;
            }
            // Check if the character is a special character
            else if (!Character.isLetterOrDigit(c)) {
                hasSpecialChar = true;
            }
            // Check if the character is a digit
            else if (Character.isDigit(c)) {
                hasDigit = true;
            }

            // If all requirements are met, return true
            if (hasUpperCase && hasLowerCase && hasSpecialChar && hasDigit) {
                return true;
            }
        }

        // If all requirements are not met, return false
        return false;
    }

}
