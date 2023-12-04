package veer.com;

public class firtpositionandlastpoistionunsortedarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int arr []= {5, 3, 8, 2, 7, 5, 9, 4, 6, 1,7};
    int data =7;
    int fisrt=-1;
    int last=-1;
    
   
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]==data) {
				if (fisrt==-1) {
					fisrt=i;
				}
				last=i;
			}
		}	
		System.out.println(fisrt);
		System.out.println (last);
    
	}

}
