package leetcode;

import java.util.Arrays;

public class SingleNumber {

	public static void main(String[] args) {
		int arr[] = {1,0,1};
		Arrays.sort(arr);
		System.out.println(find(arr)); 
	}

	private static int find(int[] nums) {
		int count = 1 ;
		if(nums.length == 1) {
			return nums[0];
		}
		for(int i = 1 ; i < nums.length ; i++) {
			
			if(nums[i] == nums[i-1]) {
				count = 2;
			} else if(nums[i] != nums[i-1] && count == 2 && i == (nums.length - 1) ) {
				return nums[i];
			} else if(nums[i] != nums[i-1] && count == 2) {
				count = 1;
			} else if(nums[i] != nums[i-1] && count == 1) {
				return nums[i-1];
			} 
		}
		return -1;
	}

}
