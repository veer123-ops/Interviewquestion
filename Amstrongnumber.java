package veer.com;



public class Amstrongnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int n=371;
  int rev=0;
  int org=n;
  int sum=0;
  
  while(n!=0) {
	  rev=n%10;
	  sum=rev*rev *rev+ sum;
	  
	  n=n/10;
  }if (org==sum) {
	System.out.print(org + " this anmstrong number");
}else {
	System.out.print(org + "this is not amstrong number");
}
	}

}
