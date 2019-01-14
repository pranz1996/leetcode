package leetcode;

import java.util.HashMap;

public class ContainsDuplicate {

	public static void main(String[] args) {
		int nums[] = {1,2,3,1};
		System.out.println(containsDuplicate(nums));
	}
	public static boolean containsDuplicate(int nums[]) {
		HashMap<Integer, Integer> hm = new HashMap<>();
        
        for(int i : nums){
            if(hm.containsKey(i)){
                return true;
            } else {
                hm.put(i,1);
            }
        }
        return false;
	}
}
