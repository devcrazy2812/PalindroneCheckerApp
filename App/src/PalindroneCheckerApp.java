public class PalindroneCheckerApp {

    public static void main(String[] args) {

        // UC4: Character Array Based Palindrome Check
        String text = "radar";

        // Convert string to character array
        char[] chars = text.toCharArray();

        int start = 0;
        int end = chars.length - 1;
        boolean isPalindrome = true;

        // Two-pointer comparison
        while (start < end) {
            if (chars[start] != chars[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        // Print result
        if (isPalindrome) {
            System.out.println(text + " is a palindrome.");
        } else {
            System.out.println(text + " is NOT a palindrome.");
        }
    }
}