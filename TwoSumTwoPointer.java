package veer.com;

import java.util.Arrays;

public class TwoSumTwoPointer {
    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 15};
        int target = 17;

        int[] result = twoSum(numbers, target);

        System.out.println(Arrays.toString(result));
    }

    // Function to find indices of two numbers that add up to the target using two pointers
    public static int[] twoSum(int[] nums, int target) {
       
        // Return an empty array if no solution is found
    	for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
              if(nums[i]+nums[j]==target){
                int a [] ={i,j};
                return a;
              }
            }
          }
          return null;
    }
}
