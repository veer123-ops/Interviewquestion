package veer.com;

public class fisrtanddlastrstingfindpostion {


	public static int first=-1;
	public static int last=-1;

     public static void findOcecc(String str, int indx, char element) {
	
	if(indx == str.length()) {
		System.out.println(first);
		System.out.println(last);
		return;
		
	}
		char charr=str.charAt(indx);
		if(charr==element) {
			if(first==-1) {
				first=indx;
			}else {
				last=indx;
			}
		}
		
		findOcecc(str, indx+1, element);
	}
	

	public static void main(String[] args) {
		String str= "abgcdgscdahjtjgfjfjrtyjr6tyjuyjidjsayawefrwqrq2e124e3rtghbfvdesa";
	// TODO Auto-generated method stub
		findOcecc(str, 0,'a');
	}

}
