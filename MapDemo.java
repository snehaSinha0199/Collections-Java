package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * CONCEPTUAL DIFFERENCE:-
 *1.In Map you can insert key-value(entry) pair.
 *In Other words :-If you are talking about key-value association then we should go for map.
 *e.g;Fetch all the students of sirt college.
 *NOTE:-
 *1.key-value is key value combinedly called as Entry in Map
 *2.Map is not the part of Collection.
 *3.In Map duplicate keys are not allowed but value can be allowed.
 * 
 * 1.If duplicate keys are not allowed but value can be.
 * 2.Entry order is not preserved then use HashMap.
 * S
 * HASHTABLE:-
 * 1.If duplicate keys are not allowed but value can be.
 * 2.Entry order is not preserved.
 * 3.it should be thread safe theen use HashTable but it is not recommended.
 * 
 * LINKEDHASHMAP:-
 * 1.If duplicate keys are not allowed but value can be.
 * 2.Entry order is preserved then use LinkedHashMap.
 * 
 * TREE MAP:-
 *  1.If duplicate keys are not allowed but value can be.
 * 2.Entry order is in sorted(natural sorting by key) order then use TreeMap.
 * NOTE:-
 * 
 * TECHNICAL DIFFERENCE OF HashMap:-
 * 1.In HashMap null key and value are allowed.
 * 2.It is thread safe.
 * 
 **/
public class MapDemo {
public static void main(String[] args) {
	Map<String,String> map=new HashMap<>();
	map.put(null,null);
	map.put(null, null);
	System.out.println(map.put("T","aastha"));
	map.put("S","pratiksha");
	map.put("E","sneha");//return the value of sneha and will print swarna in place of sneha
	System.out.println(map.put("E","swarna"));
	System.out.println(map);
	System.out.println(map.get("E"));
	
	Map<String,List<String>> map1=new HashMap<>();
	List<String> list=new ArrayList<>();
	list.add("prateeksha");
	list.add("geeta");
	list.add("nasa");
	list.add("lata");
	list.add("priya");
	map1.put("S", list);
	System.out.println(map1.get("S"));
	
	Map<String,List<String>> map2=new HashMap<>();
	List<String> list1=new ArrayList<>();
	list1.add("sumaiya");
	list1.add("madhuri");
	list1.add("ruchi");
	list1.add("tina");
	list1.add("riya");
	map2.put("E",list1);
	System.out.println(map2.get("E"));
	
	Map<String,List<String>> map3=new HashMap<>();
	List<String> list2=new ArrayList<>();
	list2.add("aastha");
	list2.add("Lata");
	list2.add("anushka");
	list2.add("harshita");
	list2.add("sonam");
	map3.put("T",list2);
	System.out.println(map3.get("T"));
	
	map3.containsKey(map3);
	System.out.println(map3);
	
	
	
}
}
