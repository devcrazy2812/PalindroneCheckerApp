public class PalindroneCheckerApp {

    public static void main(String[] args) {

        // UC2: Hardcoded Palindrome Check
        String word = "madam";   // hardcoded string
        String reversed = new StringBuilder(word).reverse().toString();

        if (word.equals(reversed)) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is NOT a palindrome.");
        }
    }
}
