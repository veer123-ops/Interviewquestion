package veer.com;

public class Stringreverse {
	public static void main(String[] args) {
		
		String string="veer is good boy";
		
		for (int i = string.length()-1; i >=0; i--) {
			System.out.print(string.charAt(i));
		}
}
}