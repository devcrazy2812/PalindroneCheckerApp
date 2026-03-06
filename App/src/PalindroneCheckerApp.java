import java.util.Deque;
import java.util.ArrayDeque;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // UC7: Deque-Based Optimized Palindrome Check
        String input = "refer";

        // Create Deque
        Deque<Character> deque = new ArrayDeque<>();

        // Insert characters into deque
        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }

        boolean isPalindrome = true;

        // Compare front and rear characters
        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("UC7 Result: " + input + " is a palindrome.");
        } else {
            System.out.println("UC7 Result: " + input + " is NOT a palindrome.");
        }
    }
}