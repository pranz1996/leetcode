package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _34_find_first_last_position {
	static List<Integer> list = new ArrayList<>();
	public static void main(String[] args) {
		int nums[] = {2,2};
		int arr[] = search(nums,2);
		
	}
	
	public static int[] search(int[] nums, int target) {
        
		int low = 0, high = nums.length - 1;
		int index = binarySearch(nums, low, high, target);
		
		int temp[];
	
		if(nums.length == 1){
            if(nums[0] == target){
                int temp1[] = new int[2];
			    temp1[0] = 0;
			    temp1[1] = 0;
			    return temp1;
            }
        }
		
		if(index == -1) {
			temp = new int[2];
			temp[0] = -1;
			temp[1] = -1;
			return temp;
		}
		
		if(index-1 >= 0 && nums[index-1] == target) {
			while(index-1 >= 0 && nums[index-1] == target ) {
				list.add(index-1);
				index = index - 1;
			}
		} else {
			while(index+1 < nums.length && nums[index+1] == target) {
				list.add(index+1);
				index = index + 1;
			}
		}
		
		System.out.println(list);
		
		Collections.sort(list);
		
		temp = new int[list.size()];
		for(int i = 0; i < temp.length; i++) {
			temp[i] = list.get(i);
		}
		return temp;
    }
	
	public static int binarySearch(int[] nums, int low, int high, int target) {
		while(low <= high) {
			int mid = low + (high - low)/2;
			if(nums[mid] == target) {
				list.add(mid);
				return mid;
			} else if(nums[mid] < target) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return -1;
	}

}
