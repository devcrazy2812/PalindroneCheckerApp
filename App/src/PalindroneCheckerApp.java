public class PalindroneCheckerApp {

    public static void main(String[] args) {

        // UC3: Palindrome Check Using String Reverse
        String input = "level";
        String reverse = "";

        // Reverse the string using for loop
        for (int i = input.length() - 1; i >= 0; i--) {
            reverse = reverse + input.charAt(i);
        }

        // Compare original and reversed string
        if (input.equals(reverse)) {
            System.out.println("Input String: " + input);
            System.out.println("Reversed String: " + reverse);
            System.out.println("Result: It is a Palindrome");
        } else {
            System.out.println("Input String: " + input);
            System.out.println("Reversed String: " + reverse);
            System.out.println("Result: It is NOT a Palindrome");
        }
    }
}