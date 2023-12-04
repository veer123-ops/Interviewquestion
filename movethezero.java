package veer.com;

public class movethezero {
	
	public static void movethzero(int arr []) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int arr [] = {10,2,0,4,0,3,5,7};
     for (int i = 0; i < arr.length-1; i++) {
		for (int j = 0; j < arr.length-i-1; j++) {
			if (arr[j]==0 && arr[j+1]!=0) {
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
			
		}
		
		
	}
     movethzero(arr);
     
     
	}

}
