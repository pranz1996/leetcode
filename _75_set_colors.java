package leetcode;

public class _75_set_colors {

	public static void main(String[] args) {
		int arr[] = {2,0,2,1,1,0};
		sortColors(arr);
	}

	public static void sortColors(int[] nums) {
        int i;
        for(i = 1; i < nums.length; i++){
            int temp = nums[i];
            int j = i - 1;
            while(j >= 0 && nums[j] > temp) {
                nums[j+1] = nums[j];
                j--;
            }
             nums[j+1] = temp;
        }
    }
}
