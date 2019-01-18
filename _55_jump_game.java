package leetcode;

public class _55_jump_game {

	public static void main(String[] args) {
		int nums[] = {2,3,1,1,4};
		System.out.println(" yes " + canJump(nums));
	}
	
    public static boolean canJump(int[] nums) {
    	/*
        if(nums.length == 0)
            return false;
        if(nums.length == 1){
            if(nums[0] == 1)
                return true;
            else
                return false;
        }
        
        int i = 0, n = nums.length; 
        int counter = 0;
        while(i < n){
      
            i = i + nums[i];
      
            if(i == n - 1)
                return true;
            if(counter > 0 && nums[i] == 0)
            	return false;
            	
            counter++;
            	
        }
        return true;   
    }  */
    	int reachable = 0;
    	for (int i=0; i<nums.length; ++i) {
    		if (i > reachable) return false;
    		reachable = Math.max(reachable, i + nums[i]);
    	}
    	return true;
    }
}
