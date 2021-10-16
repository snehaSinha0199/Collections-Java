package collection;

import java.util.Map;
import java.util.TreeMap;
/*
 * Technical Difference:-
 * 1.In TreeMap null key is not allowed but null value is allowed.
 * 2.it implements Comparable{} interface.
 * 3.It is not thread-safe.
 */
public class TreeMapDemo {
	public static void main(String[] args) {
		Map<String,String> map=new TreeMap<>();

		map.put("kala", null);
		//map.put(null,"10");
		map.put("T","aastha");
		map.put("T","anushka");
		map.put("mac",null);
		map.put("S","pratiksha");
		map.put("E","sneha");//return the value of sneha and will print swarna in place of sneha
		map.put("E","swarna");
		System.out.println(map);
		}

}
