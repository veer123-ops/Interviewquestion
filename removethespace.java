package veer.com;

public class removethespace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  String str="ram is good and he is very goodman";
  System.out.println(str);
  str=str.replaceAll("\\s", "");
  //System.out.println(str);
  System.out.println(str); 
  
  // second method
  
  char [] strArray=str.toCharArray();  
  StringBuffer sb=new StringBuffer();
  
  for(int i=0;i<strArray.length;i++) {
	  if((strArray[i]!=' ')&&(strArray[i]!='\t')) {
		  sb.append(strArray[i]);
	  }
	  
  }
  String noSpacel=sb.toString();
  //System.out.println(noSpacel);
	}

}
