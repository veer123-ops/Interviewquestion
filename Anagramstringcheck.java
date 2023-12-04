package veer.com;

import java.util.Arrays;

public class Anagramstringcheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String  tString ="veer";
   String tString2="veer";
   char x [] =tString.toCharArray();
   char y [] =tString2.toCharArray();
   
   Arrays.sort(x);
   Arrays.sort(y);
   
   boolean isrulst=Arrays.equals(x, y);
   
   if (isrulst==true) {
	System.out.print( tString + " anagram");
}else {
	System.out.print(tString2 + " this not anagram");
}
	}

}
