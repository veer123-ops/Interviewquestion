package veer.com;

public class findthesecondlargestnumber {

	public static int findsecond(int  arr []) {
		int max= Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]>max) {
				max=arr[i];
				
			}
		}
		return max;
	}
	
	
	public static int  findsecondlargest(int arr []) {
		int max=findsecond(arr);
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==max) {
				arr[i]=Integer.MIN_VALUE;
			}
		}
		
		int max1=findsecond(arr);
		return max1;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int arr [] = {10,5,6,9,3,4,5,8};
    System.out.print(findsecondlargest(arr));
	}

}
