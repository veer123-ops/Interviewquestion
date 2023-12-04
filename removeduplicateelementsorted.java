package veer.com;

public class removeduplicateelementsorted {

	///public static void main(String[] args) {
		// TODO Auto-generated method stub
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	 int arr []= {3,5,8,7,6,8,9,9,10,10,25,25,50,50};
	 int j=0;
	 
	 for(int i=0;i<arr.length-1;i++) {  
		 if(arr[i]!=arr[i+1]) {
			 arr[j++]= arr[i];
		} 
	 }
	 arr[j++]=arr[arr.length-1];
	for(int k=0;k<j;k++) {
		
		
	System.out.print(arr[k] + " ");//
	 
	}}}