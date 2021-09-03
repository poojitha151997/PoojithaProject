package org.project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Green {
	
	
	public static void main(String[] args) {
		
		//List<Integer> l=new ArrayList<Integer>();
		Integer array[] = {1,2,3,4,5,6,};
		
		System.out.println("Array: "  + Arrays.toString(array));    // array
		List<Integer> l=new ArrayList<Integer>();
		for(int i=0; i<array.length; i++) {
			l.add(array[i]);
			
			
		}	
		System.out.println("List Values " +l);   					//list
		Set<Integer> s=new LinkedHashSet<Integer>();
		s.addAll(l);
		System.out.println("SetValues"+s);							//set
		
		Map<List<Integer>, Set<Integer>> m=new LinkedHashMap<>();
		m.put(l, s);
		Set<Entry<List<Integer>,Set<Integer>>> entryset=m.entrySet();
		for(Entry<List<Integer>, Set<Integer>> entry: entryset) {
		System.out.println("Map Key values" +entry.getKey());
	System.out.println("Map get value"+entry.getValue());  		//map
		
		System.out.println(entry);
	//	System.out.println(m);
		
				}
}
	

			
}		
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	
	       
	  
	         
	               
