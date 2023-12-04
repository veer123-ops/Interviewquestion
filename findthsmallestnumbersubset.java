package veer.com;

import java.util.Arrays;

public class findthsmallestnumbersubset {
	
	
	/*public static int Findsmallest(int arr [] ,int n) {
		
		int res=1;
		
		Arrays.sort(arr);
		
		for (int i = 0; i <n; i++) {
			if (arr[i]>res) { 
				return res;
			}else {
				res+=arr[i];
		}
			
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int arr1 []= {1, 2, 5, 10, 20, 40};
     int n1=arr1.length;
      int   arr2[] = {1, 1, 1, 1};
     int n2=arr2.length;
    		System.out.println(Findsmallest(arr1, n1));
    		System.out.println(Findsmallest(arr2, n2));
     
     */
	
	public static int smallestInteger(int[] arr) {
        Arrays.sort(arr); // Sort the array

        int res = 1; // Initialize result

        // Traverse the sorted array and increment 'res' if arr[i] <= res
        for (int i = 0; i < arr.length && arr[i] <= res; i++)
            res += arr[i];

        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 6, 10, 11, 15};
        int result = smallestInteger(arr);
        System.out.println("The smallest positive integer that cannot be represented as sum: " + result);
    }
}








