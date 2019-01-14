package leetcode;

public class _13_roman_to_integer {

	public static void main(String[] args) {
		String s = "LVIII";
		System.out.println(romanToInt(s));
	}
	
	public static int romanToInt(String s) {
        int sum = 0;
           
        int i = 0;
        while(i < s.length()) {
        	String toConvert = "";
        	Character c = s.charAt(i);
        	if(c == 'I' && (i+1) != s.length() && s.charAt(i+1) == 'V') {
        		toConvert = "IV";
        		i++;
        	} else if(c == 'I' && (i+1) != s.length() && s.charAt(i+1) == 'X') {
       			toConvert = "IX";
       			i++;
        	} else if(c == 'X' && (i+1) != s.length() && s.charAt(i+1) == 'L') {
        		toConvert = "XL";
        		i++;
        	} else if(c == 'X' && (i+1) != s.length() && s.charAt(i+1) == 'C') {
        		toConvert = "XC";
        		i++;
        	} else if(c == 'C' && (i+1) != s.length() && s.charAt(i+1) == 'D') {
        		toConvert = "CD";
        		i++;
        	} else if(c == 'C' && (i+1) != s.length() && s.charAt(i+1) == 'M') {
        		toConvert = "CM";
        		i++;
        	} else {
        		toConvert += Character.toString(c);
        	}
        	sum += fixedChar(toConvert);
        	i++;
        }
		return sum;
    }
	
	private static int fixedChar(String s) {
		int ans = 0;
		
		switch (s) {
		case "I":
			ans = 1;
			break;
		case "V":
			ans = 5;
			 break;
		case "X":
			ans = 10;
			break;
		case "L":
			ans = 50;
			 break;
		case "C":
			ans = 100;
			break;
		case "D":
			ans = 500;
			 break;
		case "M":
			ans = 1000;
			 break;
		default:
			ans = twoChar(s);
			break;
		}
		return ans;
	}

	private static int twoChar(String s) {
		int ans = 0;
		
		switch (s) {
		case "IV":
			ans = 4;
			break;
		case "IX":
			ans = 9;
			 break;
		case "XL":
			ans = 40;
			break;
		case "XC":
			ans = 90;
			 break;
		case "CD":
			ans = 400;
			break;
		case "CM":
			ans = 900;
			 break;
		default:
			break;
		}
		return ans;
	}
}
