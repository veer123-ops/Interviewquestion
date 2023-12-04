package veer.com;

public class RepeatedSubsequence {
    
    public static boolean hasRepeatedSubsequence(String str) {
        int n = str.length();
        // Create a DP array to store if subsequence of length i is present
        boolean[] dp = new boolean[n + 1];
        
        for (int i = 1; i <= n; i++) {
            for (int j = i + 1; j <= n; j++) {
                // If characters match and it's not the same position
                if (str.charAt(i - 1) == str.charAt(j - 1) && i != j) {
                    // If a subsequence of length i-1 was already found, return true
                    if (dp[i - 1]) {
                        return true;
                    }
                    dp[i] = true;
                }
            }
        }
        
        return false;
    }
    
    public static void main(String[] args) {
        String str = "ababc";
        if (hasRepeatedSubsequence(str)) {
            System.out.println("The string contains a repeated subsequence.");
        } else {
            System.out.println("The string doesn't contain a repeated subsequence.");
        }
    }
}
