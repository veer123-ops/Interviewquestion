package veer.com;

public class bullosortArrays {
	
	public static void Bullsort(int arr []) {
		for (int i = 0; i < arr.length; i++) {
			System.err.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr [] = {10,2,3,4,5,6,7,8};
		 for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-1; j++) {
				if (arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		 
		 Bullsort(arr);
	}

}
