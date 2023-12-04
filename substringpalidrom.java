package veer.com;

public class substringpalidrom {

	    public static void main(String[] args) {
	        // Test strings
	        String[] arr = { "dad", "malayalam", "papa" };
	        for (String s : arr) {
	            System.out.println(isPallindrome(s));
	        }
	    }

	    static boolean isPallindrome(String s) {
	        int len = s.length();
	        for (int i = 0; i < len / 2; i++) {
	            if (!s.substring(i, i + 1).equals(s.substring(len - i - 1, len - i))) {
	                return false;
	            }
	        }
	        return true; 
	    }
	}

