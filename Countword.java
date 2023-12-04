 package veer.com;

import java.util.Scanner;

public class Countword {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		public static void main(String[] args) {
			// TODO Auto-generated method stub

			Scanner sc=new Scanner(System.in);
			String str=sc.nextLine();
			 
			int count =1;
			for(int i=0;i<str.length()-1;i++) {
				if((str.charAt(i)==' ') && (str.charAt(i+1)!=' ')) {
					count++;
				}
			}
			System.out.print(count+"   Numbers of String   ");
		}
 
	

}
