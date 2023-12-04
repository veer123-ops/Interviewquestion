package veer.com;

public class firtpositionandlastpoistiosortedarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1 [] = {10,20,30,30,40,45,45,69,69};
		int fist=-1;
		int last =-1;
	    int data=69;
	    
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i]==data  && fist==-1) {
				fist=i;
				
			}if (arr1[i]== data && fist!=-1) {
				last=i;
			}
		}
		 System.out.print(fist + "= " + last);
		
	}

}
