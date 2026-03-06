import java.util.LinkedList;

public class PalindroneCheckerApp {

    public static void main(String[] args) {

        // UC8: Linked List Based Palindrome Check
        String input = "level";

        // Create LinkedList to store characters
        LinkedList<Character> list = new LinkedList<>();

        // Add each character to the linked list
        for (char c : input.toCharArray()) {
            list.add(c);
        }

        boolean isPalindrome = true;

        // Compare first and last elements
        while (list.size() > 1) {
            if (list.removeFirst() != list.removeLast()) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("Input : " + input);
            System.out.println("Is Palindrome? : true");
        } else {
            System.out.println("Input : " + input);
            System.out.println("Is Palindrome? : false");
        }
    }
}