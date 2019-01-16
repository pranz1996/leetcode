package leetcode;

import java.util.HashSet;
import java.util.Set;

public class _3_Longest_Substring_Without_Repeat {

	public static void main(String[] args) {
		String s = "abcabcbb";
		// output = 3 because of wke
		int i = 0, j = 0, max = 0;
	        
		Set<Character> set = new HashSet<>();
	        
	    while( j  <  s.length() ){
	    	if(!set.contains(s.charAt(j))){
	    		set.add(s.charAt(j++));
	            max = Math.max(max,set.size());
	        } else {
	             set.remove(s.charAt(i++));
	        }
	   }
	   System.out.println(max);     
	}
}
