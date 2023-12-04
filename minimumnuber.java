package veer.com;

public class minimumnuber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int arr []= {10,5,8,93,61};
   
   int min=arr[0];
   
   for (int i = 0; i < arr.length; i++) {
	if (arr[i]<min) {
		min=arr[i];
	}
}
   
   System.out.print(min);
	}

}
