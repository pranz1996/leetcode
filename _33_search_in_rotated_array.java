package leetcode;

public class _33_search_in_rotated_array {

	public static void main(String[] args) {
		int nums[] = {1,3};
		System.out.println(search(nums,3));
	}
	
	public static int search(int[] nums, int target) {
        
		int low = 0, high = nums.length - 1;
		
		while(low < high) {
			int mid = low + (high-low)/2 ;
			if(nums[mid] > nums[high])
				low = mid+1;
			else
				high = mid;
		}
		
		int rotate = low;
		low = 0;
		high = nums.length - 1;
		
		int leftOne = binarySearch(nums, low, rotate-1,target);
		if(leftOne != -1)
			return leftOne;
		
		int rightOne = binarySearch(nums, rotate, high, target);
		if(rightOne != -1)
			return rightOne;
		
		return -1;
    }
	
	public static int binarySearch(int[] nums, int low, int high, int target) {
		while(low <= high) {
			int mid = low + (high - low)/2;
			if(nums[mid] == target) {
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
