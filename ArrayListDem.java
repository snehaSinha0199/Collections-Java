package collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDem {

public static void main(String[] args) {
	ArrayList<Integer> a=new ArrayList<>();
	List<Integer> list=new ArrayList<>();
	
	a.add(10);
	a.add(12);
	a.add(13);
	a.add(14);
	a.add(2, 17);
	a.remove(3);
	System.out.println(a);
	System.out.println(a.size());
	System.out.println(a.get(4));
	
//System.out.println(a.clone());


}
}
