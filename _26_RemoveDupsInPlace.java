package leetcode;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class _26_RemoveDupsInPlace {

	public static void main(String[] args) {
		
		/*
		HashMap<String, HashMap<String, Integer>> hm = new HashMap<String, HashMap<String,Integer>>();
		HashMap<String, Integer> temp = new HashMap<>();
		temp.put("abc", 10);
		hm.put("key", temp);
		
		
		
		for(Map.Entry<String, HashMap<String, Integer>> data : hm.entrySet()) {
		//	System.out.println(data.getKey());
			
			 Set<Entry<String,Integer>> hashSet=data.getValue().entrySet();
			
			 for(Entry<String, Integer> entry: hashSet ) {
 
		            System.out.println(data.getKey()+ " " + entry.getKey() + " " + entry.getValue());
		        }
			
		}
		
		*/ 
	
		int arr[] = {-3,-1,0,0,0,3,3};
		
		
		// creating map
        LinkedHashMap<Integer, Integer> hm = new LinkedHashMap<>();
		
        // converting prices array to map for unique values
		for(int i : arr) {
			if(hm.containsKey(i)) {               // if already exists number
				hm.put(i, hm.get(i)+1);
			} else {                              // new number
				hm.put(i, 1);                       
			}
		}
        
		System.out.println(hm);
		
	//	System.out.println(hm.keySet());
	
		int count = 0 ;
		// converting map to array values for unique inplace number
        for(Map.Entry<Integer, Integer> entry : hm.entrySet()) {
			int p = (int) entry.getKey();
		    arr[count++] = p;
			
		}
        
        
		System.out.println(" The array : ");
		for(int i = 0 ; i < count ; i++) {
			System.out.print(arr[i] + " ");
			
		}
	}

}
