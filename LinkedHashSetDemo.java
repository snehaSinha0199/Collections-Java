package collection;

import java.util.LinkedHashSet;
import java.util.Set;
/*
 * 1.In LinkedHashSet null value is allowed.
 * 2.Underline data structure are HashTable + LinkedList.
 * 3.it is in not thread-safe.
 */
public class LinkedHashSetDemo {
public static void main(String[] args) {
	Set<Integer> s=new LinkedHashSet();
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
