package collection;
import java.util.LinkedHashMap;
import java.util.Map;
/**
 *Technical Difference:-
 *1.In LinkedHashMap null key and null value both are allowed.
 *2.its not thread safe.
 * 
 *
 */
public class LinkedHashMapDemo {
public static void main(String[] args) {
	Map<String,String> map=new LinkedHashMap<>();

	map.put("kala", null);
	map.put(null,"10");
	map.put("T","aastha");
	map.put("T","anushka");
	map.put("S","pratiksha");
	map.put("E","sneha");//return the value of sneha and will print swarna in place of sneha
	map.put("E","swarna");
	System.out.println(map);
	}
}
