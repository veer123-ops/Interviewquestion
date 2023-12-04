package veer.com;

import java.util.Scanner;

public class Strinngsorting {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		//int n;
		String temp;
	   int n=sc.nextInt(); 
		String names[]= new String[n];
		Scanner sc1=new Scanner(System.in); 
		  //n=sc.nextInt();
		 for(int i=0;i<n;i++) {
			 names[i] =sc1.nextLine();
			 } 
		   for(int i=0;i<n;i++) {
			   
			 for(int j=i+1;j<n;j++) {
				 
				 if(names[i].compareTo(names[j])>0) { 
					 temp=names[i];
					 names[i]=names[j]; 
					 names[j]=temp;
				 }
				 
			 }
			 for(String name:names) {
				 System.out.println(" soterd array " +names[i]);
				 	//System.out.print(names);	
				 	} 
			 }}}
