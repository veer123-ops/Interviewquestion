package veer.com;

/*package whatever //do not write package name here */
import java.io.*;

 public class hammingdistance
{

// Java program to Find another array
// such that the hamming distance 
// from the original array is maximum

// requires O(n*n) time and O(1) extra space;

// Return the maximum hamming distance of a rotation
static int maxHamming(int arr[], int n){
		
	int hmmd = 0;
		
	// outer loop for how much rotation
	for(int j = 1; j < n; j++){ 
		
		hmmd = 0;
	
		// inner loop to compare elements with elements on shifted index
		for(int i = 0 ; i < n; i++){
			if(arr[i] != arr[(i + j) % n])
				hmmd++;
		}
	
		// max possible hamming distance is n, no need to check further
		if(hmmd == n)
			return n;
	}
	return hmmd;
}

// Driver code
public static void main(String args[])
{
	int arr[] = {2, 4, 6, 8}; 
	int n = arr.length;
	System.out.println(maxHamming(arr, n)); 
}
}

// This code is contributed by shinjanpatra
