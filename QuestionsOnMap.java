package collection;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

/**
 *Q1.You are given an array={"alok","prateksha","alok","tulsi","aastha","prateksha",
 *   "aastha","sneha","swarna","sneha","alok"};
 *Output should be:-
 *alok 3
 *prateksha 2
 *tulsi 1
 *aastha 2
 *sneha 2
 *swarna 1
 *
 *Q2.you are given an array={"aastha,720","swarna,840","pratiksha,830","sneha,850","alok,640",
 *"tulsi,890","shailu,820"};print/return the name of the student who obtained max marks.
 *Output should be :-tulsi
 *
 *Q3.How HashMap internally works?
 *Q4.Sort Map by value?
 *Q5.How many ways you can iterate Map?
 *Q6.How can you make Map thread safe?
 *ans.Collections.synchronizedMap(map);
 *Q7.what is the default size of a Map?
 *Ans.16,when its threshold fill 75% then its size gets double.
 *Q8.what is fail-fast and fail-safe?
 *ans.ConcurrentModificationException
 *
 * 
 *
 */
//How many ways
public class QuestionsOnMap {
public static void main(String[] args) {
	Map<String,String> map=new TreeMap<>();

	map.put("kala", null);
	//map.put(null,"10");
	map.put("T","aastha");
	map.put("T","anushka");
	map.put("mac",null);
	map.put("S","pratiksha");
	map.put("E","sneha");//return the value of sneha and will print swarna in place of sneha
	map.put("E","swarna");
	System.out.println(map);
	for(Map.Entry<String, String> entry:map.entrySet()) {
		System.out.println(entry.getKey()+" "+entry.getValue());
	}
	System.out.println();
	//way 2
	//Set<Entry<String,String>> entrySet=map.entrySet();
map.forEach((K,V)->System.out.println(K+" "+V));
//way3
Set<String> keySet=map.keySet();
Iterator<String> iterator=keySet.iterator();
while(iterator.hasNext()) {
	String k=iterator.next();
	System.out.println(k+" "+map.get(k));
}

	
	
}
}
