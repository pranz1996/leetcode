package leetcode;

import java.util.*;

public class _78_subsets {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4};
		System.out.println(subsets(arr));
	}
	
	public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        
        long size = (long) Math.pow(2, nums.length);
       
        for( int i = 0; i < size; i++) {
        	temp.clear();
        	for(int j = 0; j < nums.length; j++) {
        		if( (i & (1 << j)) > 0 ) {
        			System.out.println(i + " " + j);
        			temp.add(nums[j]);
        		}
        	}
        	list.add(new ArrayList<>(temp));
        }
        
        return list;
    }
	
	

}
