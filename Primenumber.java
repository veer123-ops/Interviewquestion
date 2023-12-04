package veer.com;

public class Primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int n=5;
   
   int temp=0;
   
   for (int i = 2; i <=n-1; i++) {
	if (n%i==0) {
		temp=temp+1;
	}
}if (temp==0) {
	System.out.print(n + " primenumber");
}else {
	System.out.print( n + " this is not prime");
}
	}

}
