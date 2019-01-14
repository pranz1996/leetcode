package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _15_3Sum {

	public static void main(String[] args) {
		int nums[] = {-1, 0, 1, -2, 1, 2};
		System.out.println(threeSum(nums));
	}
	
	public static List<List<Integer>> threeSum(int[] nums) {
       
		List<List<Integer>> allTriplets = new ArrayList<>();
		List<Integer> triplet = new ArrayList<>();
		
		Arrays.sort(nums);
		
		List<Integer> al = new ArrayList<>();
		
		for(int i :  nums) {
			al.add(i);
		}
		
		int j = 0;
		if(al.contains(0)) {
			while(j < nums.length) {
				if(nums[j] < 0) {
					int k = nums[j];
					triplet.clear();
					if(al.contains(Math.abs(k))) {
						triplet.add(k); triplet.add(0); triplet.add(Math.abs(k));
						allTriplets.add(triplet);
						}
					} 
				} 					
				j++;
			}
		System.out.println(allTriplets);	
		return null;
    }
}
