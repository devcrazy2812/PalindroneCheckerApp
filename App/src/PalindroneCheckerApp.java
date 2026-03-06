import java.util.Stack;
import java.util.ArrayDeque;
import java.util.Deque;

public class PalindroneCheckerApp {

    public static void main(String[] args) {

        String input = "racecar";

        long start, end;

        start = System.nanoTime();
        boolean result1 = checkUsingReverse(input);
        end = System.nanoTime();
        long timeReverse = end - start;

        start = System.nanoTime();
        boolean result2 = checkUsingStack(input);
        end = System.nanoTime();
        long timeStack = end - start;

        start = System.nanoTime();
        boolean result3 = checkUsingDeque(input);
        end = System.nanoTime();
        long timeDeque = end - start;

        System.out.println("Input : " + input);
        System.out.println("Reverse Method : " + result1 + " | Time: " + timeReverse + " ns");
        System.out.println("Stack Method   : " + result2 + " | Time: " + timeStack + " ns");
        System.out.println("Deque Method   : " + result3 + " | Time: " + timeDeque + " ns");
    }

    static boolean checkUsingReverse(String input) {
        String rev = new StringBuilder(input).reverse().toString();
        return input.equals(rev);
    }

    static boolean checkUsingStack(String input) {
        Stack<Character> stack = new Stack<>();
        for (char c : input.toCharArray()) {
            stack.push(c);
        }
        for (char c : input.toCharArray()) {
            if (stack.pop() != c) {
                return false;
            }
        }
        return true;
    }

    static boolean checkUsingDeque(String input) {
        Deque<Character> deque = new ArrayDeque<>();
        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }
        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }
        return true;
    }
}