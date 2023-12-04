package veer.com;

public class fibonacseriesnumber {

	public static int fibonseries(int n) {
		
		if (n==1 || n==0) {
			return n;
		}
		return fibonseries(n-1)+fibonseries(n-2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int n=8;
  for (int i = 0; i <=n; i++) {
	System.out.print(fibonseries(i) + " ");
}
  System.out.print(fibonseries(n));
	}

}
