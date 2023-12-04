package veer.com;

public class Palindromstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  String string ="nitin";
   String string2="";
  
   for (int i = string.length()-1;i>=0;i--) {
	 string2=string2+string.charAt(i);
}if (string.equals(string2)) {
	System.out.print(string + " this palindromstring");
}else {
	System.out.print(string + " this not palindromstring");
}
  
	}

}
