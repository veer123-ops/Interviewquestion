package veer.com;

public class Findthepostionstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  String string="jhhjghgjhghj";
  char string1 ='g';
  char x [] =string.toCharArray();
   for (int i = 0; i < x.length; i++) {
	if (x[i]==string1) {
		System.out.print(i  + " this is position");
		break;
	}
}
  
  
	}

}
