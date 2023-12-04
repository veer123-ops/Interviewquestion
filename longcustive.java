package veer.com;

public class longcustive {
	
	public static int  longcustive(int arr [] ,int target) {
		int count =0;
		int max=0;
		for(int val :arr) {
			if(val==target) {
				count++;
				max=Math.max(max,count);
			}else {
				count=0;
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr [] = {1, 2, 2, 3, 3, 3, 4, 4, 4,4 ,4,4, 5, 5};
		    int data =5;
		    System.out.print(longcustive(arr, data));
}
} 