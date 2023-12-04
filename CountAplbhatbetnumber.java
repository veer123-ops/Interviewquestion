package veer.com;

public class CountAplbhatbetnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  String str="VeerchnadraRamvijay";
  
  int count=1;
  
  for(int i=1;i<str.length();i++) {
	  if(str.charAt(i)!=' ') {
	  count++;
  }
	}
  System.out.print(count);
//System.out.print(str.length));
}}
   