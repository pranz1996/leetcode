package leetcode;

public class _11_Containter_with_most_water {

	public static void main(String[] args) {
		int arr[] = {1,1};
		System.out.println(maxAreaOptimizedVersion(arr));
	}
	
	public static int maxAreaOptimizedVersion(int[] height) {
		int left = 0, right = height.length - 1;
		int maxArea = 0;
		
		while(left < right) {
			maxArea = Math.max( maxArea, Math.min(height[left], height[right]) * (right-left));
			
			if(height[left] < height[right])
				left++;
			else
				right++;
		}
		return maxArea;
	}
	public static int maxArea(int[] height) {
		
		int Final[] = new int[height.length];
		int i, j;
		for( i = 0; i < Final.length ; i++) {
			Final[i] = 0;
		}
		int localArea = 0;
		for( i = 0 ; i < height.length; i++) {
			for(j = i+1 ; j < height.length; j++) {
				localArea = areaOfTwo(height[i], height[j],Math.abs(i-j));
				if(localArea > Final[i]) {
					Final[i] = localArea;
				}
			}
		}
		
		return findMax(Final);    
    }
	private static int findMax(int[] arr) {
		int max = arr[0];
		
		for(int i = 1; i < arr.length ; i++){
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		
		return max;
	}
	private static int areaOfTwo(int a, int b, int j) {
		if(a < b) {
			return a*j;
		} else {
			return b*j;
		}
	}
}
