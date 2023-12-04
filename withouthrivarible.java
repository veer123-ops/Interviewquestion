package veer.com;

import java.util.Scanner;

public class withouthrivarible {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int a=sc.nextInt();
			int b=sc.nextInt();
			a=a^b;
			b=a^b;
			a=a^b;
			///a=a+b;
			//b=a-b; 
			//a=a-b;
			System.out.println(a);
			 System.out.println(b);
	}

}
