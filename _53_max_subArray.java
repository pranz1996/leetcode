package leetcode;

public class _53_max_subArray {

	public static void main(String[] args) {
		int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(maxSubArray(arr));
	}
	
	
	public static int maxSubArray(int[] nums) {
        int n = nums.length;
        int max = divide(nums,0,n-1);
        
        return max;
    }


	private static int divide(int[] nums, int low, int high) {
		
		if( low == high)
			return nums[low];
		int mid = (low + high) / 2;
		
		return Math.max(Math.max(divide(nums, low, mid), divide(nums, mid+1, high)), maxCrossingSum(nums,low,mid,high));
	}


	private static int maxCrossingSum(int[] nums, int low, int mid, int high) {
		int left_sum = Integer.MIN_VALUE;
		int sum = 0;
		
		for(int i = mid; i >= low; i--) {
			sum += nums[i];
			if(sum > left_sum)
				left_sum = sum;
		}
		
		sum = 0;
		int right_sum = Integer.MIN_VALUE;
		for(int i = mid + 1; i <= high; i++) {
			sum += nums[i];
			if(sum > right_sum)
				right_sum = sum;
		}
	
		return left_sum + right_sum;
	}
	

}
