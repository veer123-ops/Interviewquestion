package veer.com;

import java.util.Arrays;

public class arraysequal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int arr [] = {1,2,3,45};
   int arr1 [] = {1,2,3,45,5};
   
  boolean isture=Arrays.equals(arr, arr1);
  
 if (isture==true) {
	System.err.print("equal");
}else {
	System.err.print("is not equal");
}
   
	}

}
