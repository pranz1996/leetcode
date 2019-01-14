package leetcode;

public class RotateArray {
	
	static int nums[] = {-1, -100, 3, 99} ;
	static int k = 2;
	public static void main(String[] args) {
		
		for(int i = 0 ; i < k ; i++) {
			rotate();
		}
		System.out.println(" The output : ");
		for(int i = 0 ; i < nums.length ; i++) {
			System.out.print(nums[i] + " ");
		}
	}
	private static void rotate() {
		int temp = nums[nums.length -1];
		for(int i = nums.length-1 ; i > 0 ; i--) {
			nums[i] = nums[i-1];
		}
		nums[0] = temp;
	}

}
