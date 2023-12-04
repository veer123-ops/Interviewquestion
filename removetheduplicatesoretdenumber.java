package veer.com;

public class removetheduplicatesoretdenumber {

	 

			
		 static int removeelement(int [] arr) {
			
			int temp=0;
			
			for(int i=0;i<arr.length;i++) {
				if(arr[temp] != arr[i]) {
					 
					
				//temp++;            // second apporcha
					//arr[temp]= arr[i];
					 
					
					arr[++temp]= arr[i];  		//ist apporch
					
					
					
					
					//arr[temp+1]= arr[i]; // secondapporch
					//temp++;
				}
			} 
			return temp+1;  
		 } 
			 
	 
		public static void main(String[] args) {
			// TODO Auto-generated method stub 
			
			int [] arr= {2,2,3,3,4,4,4,5,6,6,8,8,10,10,20,20}; // strorted arrays
			for(int i=0;i<arr.length;i++) {
				System.out.print(arr[i]+ "  ");
			}
			int  n=removeelement(arr);
			System.out.println();
			for(int i=0;i<n;i++) {
				System.out.print(arr[i]+ " "); 
			}
		}
}