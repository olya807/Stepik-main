public class isPalindrome {
    public static boolean isPalindrome(String text) {
        return new StringBuilder(text.replaceAll("[^a-zA-Z0-9]", "")).reverse().toString().equalsIgnoreCase(text.replaceAll("[^a-zA-Z0-9]", ""));
    }
}