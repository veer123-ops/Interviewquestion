package veer.com;

import java.util.Arrays;

public class findtheduplicemlentArrayselement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int arr [] =  {2,5,9,6,8,9,2,10};
 for (int i = 0; i < arr.length-1; i++) {
	for (int j = i+1; j < arr.length; j++) {
		if (arr[i]==arr[j]) {
			 System.out.print(arr[i]+ " ");
		}
	}
	
	
}
 

	}}
