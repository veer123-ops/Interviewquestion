package veer.com;

public class deleteArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {1,28,9,20,10};  
		  
		  int del=20;
		  
		  for(int i=0;i<arr.length;i++) {
			  if(del==arr[i]) {
				  
				  for( int j=i;j<arr.length-1;j++) {
					   arr[j]=arr[j+1];
					    
				  }
				  break;
				  
			  }
		  } 
		  for(int i=0;i<arr.length-1;i++) {
			  
			  System.out.println(arr[i]+" ");
		  }
			}
		}

	