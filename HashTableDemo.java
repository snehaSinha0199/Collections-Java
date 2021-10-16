package collection;

import java.util.Hashtable;
import java.util.Map;
/**
 * Technical Difference:-
 * 1.In HashTable null key or null value both are not allowed.
 * 2.it is thead-safe.
 * 3.its performance is poor then other than Map implementation.
 *
 */
public class HashTableDemo {
public static void main(String[] args) {
	Map<String,String> map=new Hashtable<>();
	//map.put("kala", null);
	System.out.println(map.put("T","aastha"));
	map.put("s","pratiksha");
	map.put("E","sneha");//return the value of sneha and will print swarna in place of sneha
	System.out.println(map.put("E","swarna"));
	System.out.println(map);
	System.out.println(map.get("E"));
}
}
