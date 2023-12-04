package veer.com;

public class Arraysortedyanotsorted {
	
	public static boolean Arrayseortedyanotsorted(int arr []) {
		for (int i = 1; i < arr.length; i++) {
			if (arr[i]<arr[i-1]) {
				return false;
			}
		}
		return true;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr [] = {3,4,5,6,7,8};
		 boolean issorted=Arrayseortedyanotsorted(arr);
		 if (issorted==true) {
			System.out.print("yes");
		}else {
			System.out.print("no");
		}
	}

}
