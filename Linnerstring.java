package veer.com;

public class Linnerstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] str= {"java","raja","veer","rama","veer"};
		
	String dataString ="rama";
	
	for (int i = 0; i < str.length; i++) {
		if (str[i].equals(dataString)) {
			System.out.print( i + " this found the string string");
			break;
		}
	}
	}

}
