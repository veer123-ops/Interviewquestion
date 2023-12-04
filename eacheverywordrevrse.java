package veer.com;

public class eacheverywordrevrse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  String string="veer is good boy";
  String string2 ="";
  
 String  x [] =string.split("\\s");
 for (String wString: x ) {
	StringBuilder  nBuilder =new StringBuilder(wString);
	nBuilder.reverse();
	string2=string2+nBuilder.toString() + " ";
	
}
 System.out.print(string2);
	}

}
