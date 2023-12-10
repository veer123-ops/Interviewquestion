package monabab.com;

import java.util.HashMap;
import java.util.Map;

public class Countthefrequnecycharchetr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String string="gvdcvmhjfberhfrehfderhfuer";
 char x [] = string.toCharArray();
 HashMap<Character , Integer > mpHashMap =new HashMap<>();
 
 for(char val :x) {
	 mpHashMap.put(val ,mpHashMap.getOrDefault(val,0)+1);
 }for(Map.Entry<Character, Integer>entry :mpHashMap.entrySet()){
	 System.out.print(entry.getKey()  + " " + entry.getValue());
 }
 
	}

}
