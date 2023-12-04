package veer.com;

public class findthesecondmininumber {

	public static int findsecond(int  arr []) {
		int min= Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]<min) {
				min=arr[i];
				
			}
		}
		return min;
	}
	
	
	public static int  findsecondmini(int arr []) {
		int min=findsecond(arr);
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==min) {
				arr[i]=Integer.MAX_VALUE;
			}
		}
		
		int min1=findsecond(arr);
		return min1;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int arr [] = {10,5,6,9,3,4,5,8};
    System.out.print(findsecondmini(arr));
	}

}
