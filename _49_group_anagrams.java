package leetcode;

import java.util.*;

public class _49_group_anagrams {

	public static void main(String[] args) {
		String strs[] = {"eat", "tea", "tan", "ate", "nat", "bat"};
		System.out.println(groupAnagrams(strs));
		
	}
	public static List<List<String>> groupAnagrams(String[] strs) {
		
		if(strs == null || strs.length == 0)
			return new ArrayList<>();
		
		Map<String, List<String>> map = new HashMap<String, List<String>>();

		for(String s : strs) {
			char ca[] = s.toCharArray();
			Arrays.sort(ca);
		
			String key = String.valueOf(ca);
			
			if(!map.containsKey(key))
				map.put(key, new ArrayList<String>());
			map.get(key).add(s);
		}
		return new ArrayList<List<String>>(map.values());
    }
}
