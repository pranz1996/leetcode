package leetcode;

public class _29_divide_two {

	public static void main(String[] args) {
		System.out.println(divide(0,1));
	}
	public static int divide(int dividend, int divisor) {
	
		boolean negative = false;
		if(dividend < 0 || divisor < 0) {
			negative = true;
		}
		if(dividend < 0 && divisor < 0) {
			negative = false;
		}
		
		if(dividend < 0)
			dividend = Math.abs(dividend);
		if(divisor < 0)
			divisor = Math.abs(divisor);
		
		int k = 0;
		
	
        if(dividend == 0)
            k = 0;
        else if(divisor == 1)
			k = dividend - divisor;
		else {
			while(dividend >= divisor) {
				dividend -= divisor;
				k++;
			}
		}
		
		if(negative)
			k = -k;
		
		return k;
	}
}
