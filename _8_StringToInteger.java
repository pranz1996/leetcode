package leetcode;

public class _8_StringToInteger {

	public static void main(String[] args) {
		String str = "3.14159";
		
		System.out.println(myAtoi(str));
	}

	private static int myAtoi(String str) {
		
		   
        str = str.trim();
        
        
        if(str.isEmpty())
            return 0;
        if(str.length() == 1 && str.charAt(0) == '-')
            return 0;
        
		StringBuilder temp = new StringBuilder(str);
		
       
        
		if(!Character.isDigit(temp.charAt(0)) && temp.charAt(0) != '-') {
			return 0;
		} 
		String string = "";
		if(temp.charAt(0) == '-') {
			string += '-';
		}
		for(int i = 0 ; i < temp.length(); i++) {
			char ch = temp.charAt(i);
			if(ch == '.')
				string += ch;
			if(Character.isDigit(ch)) {
				string += ch;
			}
		}

		if(string.length() >= 11) {
			if(string.charAt(0) == '-')
				return Integer.MIN_VALUE;
			else
				return Integer.MAX_VALUE;
		}
		
		int p = string.indexOf('.');
		
		if(p > 0) {
			String arr[] = string.split(".");
			for(int pe = 0 ; pe < arr.length ; pe++) {
				System.out.println(arr[pe]);
			}
		}
		
		
        if(string.length() == 1 && string.charAt(0) == '-')
            return 0;
		else if(Long.parseLong(string) < Integer.MIN_VALUE)
			return Integer.MIN_VALUE;
		else if(Long.parseLong(string) > Integer.MAX_VALUE)
			return Integer.MAX_VALUE;
		else
			return Integer.parseInt(string);
	  
	}

}
