package collection;

import java.util.Map;
import java.util.TreeMap;

public class HpmeWork {
public static void main(String[] args) {
	String[] array= {"alok","pratiksha","alok","tulsi","aastha","pratiksha","aastha",
			"sneha","swarna","sneha","alok"};
	Map<String,Integer> map=new TreeMap<>();
	for(String s:array) {
		if(map.containsKey(s)) {
			int count=map.get(s);
			count=count+1;
			map.put(s, count);
	}
	else {
		map.put(s,1);
	}
	}
	map.forEach((K,V)->System.out.println(K+" "+V));;
	for(Map.Entry<String, Integer> entry:map.entrySet()) {
		System.out.println(entry.getKey()+" "+entry.getValue());
	}
}
}
