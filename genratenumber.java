package veer.com;

public class genratenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String string="aaavvvbbbcccbbbbb";
   StringBuilder stringBuilder=new StringBuilder();
   int cout=1;
   for (int i = 0; i < string.length()-1; i++) {
	 //  int cout=1;
	if(i<string.length()-1 && string.charAt(i)==string.charAt(i+1)) {
		cout++;
	}else {
		
		stringBuilder.append(string.charAt(i));
		stringBuilder.append(cout);
		cout=1;
	}
}
   
   System.out.print(stringBuilder.toString());
	}

}
