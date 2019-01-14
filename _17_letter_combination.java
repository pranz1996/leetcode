package leetcode;

import java.util.ArrayList;
import java.util.List;

public class _17_letter_combination {

	public static void main(String[] args) {
		System.out.println(letterCombinations("23"));
	}
	public static List<String> letterCombinations(String digits) {
	     List<String> result = new ArrayList<>();
	     
	     if(digits.length() == 0)
	    	 return result;
	     
	     result.add("");
	     
	     for(int i = 0; i < digits.length(); i++) {
	    	 String s = numberToString(digits.charAt(i));
	    	 result = combine(s, result);
	    	 System.out.println(result);
	     }
	     
	     return result;
    }
	private static List<String> combine(String digit, List<String> list) {
		
		List<String> result = new ArrayList<>();
		
		for(int i = 0; i < digit.length(); i++) {
			for(String x : list) {
				result.add(x + digit.charAt(i));
			}
		}
		
		return result;
	}
	public static String numberToString(char number){
		String temp = "";
        switch(number){
            case '2':
                temp = "abc";
                break;
            case '3':
                temp = "def";
                break;
            case '4': 
                temp = "ghi";
                break;
            case '5':
                temp = "jkl";
                break;
            case '6':
                temp = "mno";
                break;
            case '7':
                temp = "pqrs";
                break;
            case '8': 
                temp = "tuv";
                break;
            case '9':
                temp = "wxyz";
                break;
        }
		return temp;
    }
}
