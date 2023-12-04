package veer.com;

import java.util.Scanner;

public class Countthevowleandconsate {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		public static void main(String[] args) { 
			// TODO Auto-generated method stub
	  Scanner sc=new Scanner(System.in);
	  String str=sc.nextLine();
	  int vowel,cons;
	  vowel =0; 
	  cons=0;
	    
	   
	  for(int i=0;i<str.length();i++) {
		  char ch=str.charAt(i);
		  if(ch!=' ') {
			  if((ch=='a')||(ch=='e')||(ch=='i')||(ch=='o')||(ch=='u')||(ch=='A')||(ch=='E')||(ch=='I')||(ch=='O')||(ch=='U')) 
				 vowel++;
				 else 
					 cons++;
				 }
			  }
	  System.out.print(vowel+" print vowel "+ cons + " consatnec");
		  }
		  
	  

	
}
