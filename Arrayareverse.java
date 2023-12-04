package veer.com;

import java.util.Arrays;

public class Arrayareverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr [] = {10,2,3,4,5,6,7,8};
		 
		 int i=0;
		 int j= arr.length-1;
		 
		 while(i<=j) {
			 int temp=arr[i];
			 arr[i]=arr[j];
			 arr[j]=temp;
			 i++;
			 j--;
		 }
		 
		 System.out.print(Arrays.toString(arr));
	}

}
