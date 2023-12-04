package veer.com;

public class ArraysRoted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int arr [] = {10,20,3,4};
   
   int n=5;
   
   for (int i = 0; i <n; i++) {
	int fisrt=arr[0],j;
	for ( j = 0; j < arr.length-1; j++) {
		arr[j]=arr[j+1];
	}
	arr[j]=fisrt;
	
}
   
   for (int i = 0; i < arr.length; i++) {
	System.out.print(arr[i] + " ");
}
   
	}

}
