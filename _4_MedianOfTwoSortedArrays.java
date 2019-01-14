package leetcode;

public class _4_MedianOfTwoSortedArrays {

	public static void main(String[] args) {
		int[] nums1 = {1, 3, 5};
		int[] nums2 = {2, 4, 6};
		int m = nums1.length, n = nums2.length;
		int l = m + n;
        int[] nums = new int[l];
        int i = 0, x = m, j = 0, y = n, k = 0;
        
        while( (i < x) && (j < y) ){
            if(nums1[i] < nums2[j]){
                nums[k++] = nums1[i++];
            } else {
                nums[k++] = nums2[j++];
            }
        }
        while(i < x) {
            nums[k++] = nums1[i++];
        }
        while(j < y) {
            nums[k++] = nums2[j++];
        }
        
        
        if(l % 2 == 0) {
        	float temp = (float)( nums[l/2] + nums[l/2 - 1]) / 2 ;
        	System.out.println(temp);
        } else {
        	System.out.println(nums[l/2]);
        }
    }
}
