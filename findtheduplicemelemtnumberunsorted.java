package veer.com;

public class findtheduplicemelemtnumberunsorted {

	// JAVA code to find
		// duplicates in O(n) time

		//class Leet442 {

			public static void main(String args[])
			{
				int arr [] = { 0, 4, 3, 2, 7, 8, 2, 3, 3,9,9,9,9,1 };  

				for (int i = 0; i < arr.length; i++) {
					arr[arr[i] % arr.length] 
						= arr[arr[i] % arr.length]
						+ arr.length;
				} 
				System.out.println("The repeating elements are : ");
				for (int i = 0; i < arr.length; i++) {
					if (arr[i] >= arr.length * 2) { 
						System.out.println(i + " "); 
					}
				}
			}
		}
	/* 


	public  List<Intger> findduplicate(int[] arr){
	List<Intger> res=new ArrayList<Integer>();

	for(int i=0;i<arr.length;i++) {
	int index=Math.abs(arr[i]-1);
	if(arr[index]<0)
	res.add(Math.abs(arr[i]));

	arr[index]=-arr[index];
				
	}
	 return res;


	}}

*/
