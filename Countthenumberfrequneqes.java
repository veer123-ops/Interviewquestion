package monabab.com;

import java.util.HashMap;
import java.util.Map;

public class Countthenumberfrequneqes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr []= {1,2,3,7,6,7,6,4,6,7,6,4,6,8,8,5,47,7,};
		 
		 HashMap<Integer, Integer> sHashMap =new HashMap<>();
		 
		 for(int val : arr) {
			sHashMap.put(val, sHashMap.getOrDefault(val,0)+1);
		 }for(Map.Entry<Integer, Integer> entry:sHashMap.entrySet()) {
			 System.out.println(entry.getKey() + "  " + entry.getValue());
		 }
		 
			

	}

}
