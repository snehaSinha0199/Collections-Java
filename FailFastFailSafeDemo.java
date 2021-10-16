package collection;
/**
 *while iterating List,Set,Map Object if you are performing another action like add or remove
 *which is gong to change the state of above mention collections then it will throw
 *java.util.ConcurrentModificationException.
 * This process is known as FailFast.
 * To resolve above problem java people intoduce below classes in java.util.concurrent package 
 * 1.CopyOnWriteArrayList
 * 2.CopyOnWriteArraySet
 * 3.ConcurrentHashMap
 * if you are using above classes instead of ArrayList,HashSet and HashMap respectively then 
 * you will not get any any exception.this process is knownas Fail-safe.
 * 
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

public class FailFastFailSafeDemo {
public static void main(String[] args) {

	//List<Integer> l=new ArrayList<>();
	List<Integer> l=new CopyOnWriteArrayList<>();
	l.add(23);
	l.add(78);
	l.add(67);
	Iterator<Integer> iterator = l.iterator();
	while(iterator.hasNext()) {
		System.out.println(iterator.next());
		//l.add(105);
	}
	//Set<Integer> s=new HashSet();
	Set<Integer> s=new CopyOnWriteArraySet<>();
	s.add(null);
	s.add(null);
	s.add(null);
	s.add(20);
	s.add(10);
	Iterator<Integer> iterator2 = s.iterator();
while(iterator2.hasNext()) {
	System.out.println(iterator2.next());
	s.add(50);
}
//Map<String,String> map=new HashMap<>();
Map<String,String> map=new ConcurrentHashMap<>();

//System.out.println(map.put("T","aastha"));
map.put("S","pratiksha");
map.put("E","sneha");
for(Map.Entry<String, String> entry:map.entrySet()) {
	System.out.println(entry.getKey()+" "+entry.getValue());
	map.put("alok","phd");
}
	}
}
