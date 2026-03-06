import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class PalindroneCheckerApp {

    public static void main(String[] args) {

        String input = "civic";

        Queue<Character> queue = new LinkedList<>();

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            queue.add(ch);
            stack.push(ch);
        }

        boolean isPalindrome = true;

        while (!queue.isEmpty()) {
            if (queue.remove() != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("UC6 Result: " + input + " is a palindrome.");
        } else {
            System.out.println("UC6 Result: " + input + " is NOT a palindrome.");
        }
    }
}