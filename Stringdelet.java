package veer.com;

public class Stringdelet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] arr= {"raja","veer","babe"};
		  
		  String str ="raja";
		  
		  for(int i=0;i<arr.length;i++) {
			  if(str.equals(arr[i])) {
				  
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
