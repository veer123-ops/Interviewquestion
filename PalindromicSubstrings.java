package veer.com;

import java.util.HashSet;

public class PalindromicSubstrings {

    // Function to find all palindromic substrings
    public static HashSet<String> allPalindromicSubstrings(String s) {
        HashSet<String> result = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            // Find palindromes with odd length
            findPalindromes(s, i, i, result);

            // Find palindromes with even length
            findPalindromes(s, i, i + 1, result);
        }

        return result;
    }

    // Helper function to find palindromes with given left and right indices
    private static void findPalindromes(String s, int left, int right, HashSet<String> result) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            result.add(s.substring(left, right + 1));
            left--;
            right++;
        }
    }

    // Test case
    public static void main(String[] args) {
        String input = "abcbadefed";
        HashSet<String> palindromicSubstrings = allPalindromicSubstrings(input);

        System.out.println("Palindromic substrings:");
        for (String palindrome : palindromicSubstrings) {
            System.out.println(palindrome);
        }
    }
}
