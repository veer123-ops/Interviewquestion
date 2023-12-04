package veer.com;

public class SubstringCount {

    public static int countSubstrings(String str) {
        int count = 0;
        int length = str.length();

        // Nested loops to generate all possible substrings
        for (int start = 0; start < length; start++) {
            for (int end = start + 1; end <= length; end++) {
                // Extract substring from start to end
                String substring = str.substring(start, end);
                System.out.println(substring); // Optional: Print substrings
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String text = "hello";
        int substrCount = countSubstrings(text);
        System.out.println("Total substrings: " + substrCount);
    }
}
