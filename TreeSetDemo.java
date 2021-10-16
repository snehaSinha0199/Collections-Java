package collection;

import java.util.Set;
import java.util.TreeSet;
/*
 * NOTE:-
 * In TreeSet null is not allowed.
 * Underline data structure is red black tree.
 */
public class TreeSetDemo {
public static void main(String[] args) {
	Set<Integer> s=new TreeSet();
	//s.add(null);
	//s.add(null);
	//s.add(null);
	s.add(20);
	s.add(10);
	//s.add(null);
	s.add(30);
	s.add(40);
	s.add(50);
	s.add(50);//duplicacy is not allowed
	//System.out.println(s.add(null));
	System.out.println(s);
	System.out.println(s.size());//6
	Set<Integer> tree=new TreeSet();
	tree.add(null);
}
}
