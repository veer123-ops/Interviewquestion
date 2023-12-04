package veer.com;

public class MajorityElement {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {10,5,6,6,6,65,2,6,3,6,6,6};
		System.out.println( marajotriye(arr,arr.length));
		
	}
		public static  int marajotriye(int[] arr,int n) {
			int candit= arr[0];
			int count=1;
			
			for(int i=0;i<n;i++) {
				if(arr[i]==candit) {
					count++;
				}else {
					count--;
				}
				if(count==0) {
					candit=arr[i];
					count=1;
				}
			}
			//verify conaditid is your vote ans orv not;
			
			count=0;
			for(int val:arr) {
				if(val==candit) {
					count++;
				}
			}
			if(count> n/2) {
				return candit;
			}else {
				return -1;
			}
			

	}

}
