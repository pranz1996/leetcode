package leetcode;

public class _8_StringToInteger {

	public static void main(String[] args) {
		String str = "3.14";
		
		System.out.println(myAtoi(str));
	}

	private static int myAtoi(String str) {
			
		str = str.trim();
        
        if(str.isEmpty())
            return 0;
     
        int index = 0, total = 0, sign = 1;
        if(str.charAt(0) == '+' || str.charAt(0) == '-') {
        	sign = str.charAt(0) == '+' ? 1 : -1;
        	index++;
        }
       
        while(index < str.length()) {
        	int digit = str.charAt(index) - '0';
        	
        	if(digit < 0|| digit > 9)
        		break;
        	
        	 if(Integer.MAX_VALUE/10 < total || Integer.MAX_VALUE/10 == total && Integer.MAX_VALUE %10 < digit)
                 return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        	
        	 total = 10 * total + digit;
        	 index++;
        }
   
        return total * sign;
        
	}

}
