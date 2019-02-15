package leetcode;

import java.util.*;
import java.util.Map;

public class _1_twoSum {

	public static void main(String[] args) {
        
		int[] nums = {11, 2, 7, 7, 7};
		
		int answer[] = new int[2];
		int target = 9;
		int i, j = 0;

	    Map<Integer, Integer> map = new HashMap<>();
	    
	    for(int p : nums)
	    	map.put(p, j++);
	    
	    for(i = 0 ; i < nums.length ; i++) {
	    	int val = target - nums[i];
	    	if( map.containsKey(val) && ( i != map.get(val) ) ){
	    		answer[0] = i;
	    		answer[1] = map.get(val);
	    		break;
	    	}
	    }
	    
	    for( i = 0 ; i < answer.length ; i++)
	    	System.out.print(answer[i] + " ");
	    
	   
	}
	
	
}



