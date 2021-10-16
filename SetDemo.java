package collection;

import java.util.HashSet;
import java.util.Set;

/*
 * 1.Duplicate elements are not allowed.
 * 2.Insertion order is not preserved then use HashSet.
 * 
 * 1.Duplicate elements are not allowed.
 * 2.Insertion order is preserved then use LinkedHashSet.
 * 
 * 1.Duplicate elements are not allowed.
 * 2.Insertion order is in sorted order(natural sorted,in ascending order)
 *  then use TreeSet.
 *  
 * 1.In HashSet null value is allowed.
 * 2.underline data structure is HashTable.
 * 3.It is not thread safe.
 */
public class SetDemo {
public static void main(String[] args) {
	Set<Integer> s=new HashSet();
	s.add(null);
	s.add(null);
	s.add(null);
	s.add(20);
	s.add(10);
	s.add(null);
	s.add(30);
	s.add(40);
	s.add(50);
	s.add(50);//duplicacy is not allowed
	s.add(null);
	System.out.println(s.add(null));
	System.out.println(s);
	System.out.println(s.size());//6
	
	
	
	
}
}
