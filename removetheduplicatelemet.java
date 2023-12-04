package veer.com;

import java.util.HashSet;

public class removetheduplicatelemet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int arr [] = {10,2,3,4,5,6,6,6,9,9,9};
  
  HashSet<Integer> mpHashSet =new HashSet<>();
  
  for (int i = 0; i < arr.length; i++) {
	mpHashSet.add(arr[i]);
  }for(int val : mpHashSet) {
	 System.out.print(val + "  ");
  }
  
	
	}}