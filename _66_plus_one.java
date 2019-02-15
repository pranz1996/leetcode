package leetcode;

public class _66_plus_one {

	public static void main(String[] args) {
		int arr[] = {1,2,3};
		arr = plusOne(arr);
	}
	
	public static int[] plusOne(int[] digits) {
        int n = digits.length;
        int divisor = -1;
        
        int i = n - 1;
        
        while( i >= 0) {
            int temp;
            if(divisor == -1) {
                 temp = digits[i] + 1;
            }
            else {
                temp = digits[i] + divisor;
                divisor = -1;
            }
            
            if( temp > 9 ){
                digits[i] = temp % 10;
                divisor = temp / 10;
                i--;
            } else {
                if(i == n-1)
                    digits[i] += 1;
                else
                    digits[i] = temp;
                i = -1;
            }
        }
        if( divisor != -1){
            int answer[] = new int[n+1];
            answer[0] = divisor;
            for( i = 1 ; i < answer.length; i++)
                answer[i] = digits[i-1];
            
            return answer;
        }
        return digits;
    }
}
