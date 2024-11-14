
public class PalindromeChecker {

    public static boolean isPalindrome(String str) {
        // Convert the string to lowercase for case-insensitive comparison
        str = str.toLowerCase();

        // Initialize two pointers, one at the beginning and one at the end
        int left = 0;
        int right = str.length() - 1;

        // Compare characters from both ends until they meet or a mismatch is found
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; // Not a palindrome
            }
            left++;
            right--;
        }

        return true; // Palindrome
    }

    public static void main(String[] args) {
        String[] testStrings = {"racecar", "level", "hello", "madam", "12321"};

        for (String str : testStrings) {
            if (isPalindrome(str)) {
                System.out.println(str + " is a palindrome.");
            } else {
                System.out.println(str + " is not a palindrome.");
            }
        }
    }
}

