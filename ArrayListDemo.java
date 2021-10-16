package collection;

import java.util.ArrayList;
import java.util.Collection;

public class ArrayListDemo {
public static void main(String[] args) {
	Collection<Integer> c=new ArrayList<>();
	System.out.println(c.size());
	c.add(56);
	c.add(87);
	c.add(45);
	c.add(34);
	Collection<Integer> c1=new ArrayList<>(c);
	c1.add(98);
	c1.add(57);
	c1.add(8);
	System.out.println(c1.size());
	System.out.println(c1.containsAll(c));
	System.out.println(c1.addAll(c));
	
	
}
}
