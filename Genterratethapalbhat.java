package veer.com;

public class Genterratethapalbhat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String string="a2b5b5n6";
		for (int i = 0; i <string.length(); i++) {
			if (Character.isAlphabetic(string.charAt(i))) {
				
				System.out.print(string.charAt(i));
				
			}else {
				int x= Character.getNumericValue(string.charAt(i)) ;
					for (int j = 0; j <x; j++) {
						System.out.print(string.charAt(i-1));
					}
				}
			}
		}
	}


