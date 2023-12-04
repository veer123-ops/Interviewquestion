package veer.com;

public class RotatedPalindrome {
    
    // Function to check if a string is a palindrome
    public static boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    
    // Function to check if a string is a rotated palindrome
    public static boolean isRotatedPalindrome(String s) {
        // Check if the string itself is a palindrome
        if (isPalindrome(s)) {
            return true;
        }
        
        // Check for rotated palindromes
        int length = s.length();
        for (int i = 1; i < length; i++) {
            String rotated = s.substring(i) + s.substring(0, i);
            if (isPalindrome(rotated)) {
                return true;
            }
        }
        
        return false;
    }
    
    // Test cases
    public static void main(String[] args) {
        String string1 = "abba";
        String string2 = "abcd";
        String string3 = "malayalam";

        System.out.println(isRotatedPalindrome(string1)); // Output: true
        System.out.println(isRotatedPalindrome(string2)); // Output: false
        System.out.println(isRotatedPalindrome(string3)); // Output: true
    }
}
