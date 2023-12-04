package veer.com;

public class palindromsubstring {
	
	public static void solution(String string) {
		for (int i = 0; i < string.length(); i++) {
			for(int j=i+1;j<=string.length();j++) {
				if (isPalindromstring(string.substring( i,j))) {
					System.out.println(string.substring(i,j));
				}
			}
		} 
		
	} 
	
	
public static boolean isPalindromstring(String string) {
	int i=0;
	int j=string.length()-1;
	while(i<j) {
		if (string.charAt(i) !=  string.charAt(j)) {
			return false;
		}
		i++;
		j--;
		}
	
	return true;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String string ="nitin";
    solution(string);
	}

}
