package veer.com;



public class palindronumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int n=151;
    
    int rev=0;
    int org=n;
    
    while(n!=0) {
    	
    	rev=rev*10+ n%10;
    	n=n/10;
    }if (org==rev) {
		System.out.print(org + " this is palindrom number" );
	}else {
		System .out.print(org + "  this is not palindrom number");
	}
	}

}
