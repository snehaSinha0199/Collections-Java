package collection;

import java.util.ArrayList;
import java.util.List;

public class ListDemo{
public static void main(String[] args) {
	List<Integer> l=new ArrayList<>();
	l.add(23);
	l.add(78);
	l.add(67);
	l.sort(null);
	System.out.println(l);
	System.out.println(l.size());
	List<Integer> l2=new ArrayList<>();
	l2.add(0);
	l2.add(11);
	l2.add(67);
	System.out.println(l2.size());
	System.out.println(l2.hashCode());
	System.out.println(l2.addAll(l));
	System.out.println(l2.containsAll(l));
	System.out.println(l2.removeAll(l));
	System.out.println("after remove" +l2);
	System.out.println(l2.retainAll(l));
	List<Student> s=new ArrayList<>();
	s.add(new Student("swarna"));
	s.add(new Student("aastha"));
	s.add(new Student("sneha"));
	s.sort(new Student(null));
	System.out.println(s);
	//l.clear();
	//System.out.println(l);
	//System.out.println(l2.isEmpty());
	l.set(1, 32);
	l.get(0);
	System.out.println(l);
	
	List<Integer> l3=new ArrayList<>();
	
}
}
