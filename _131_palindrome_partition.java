package leetcode;

import java.util.*;
public class _131_palindrome_partition {

	public static void main(String[] args) {
		String s = "aab";
		System.out.println(partition(s));
	}

	public static List<List<String>> partition(String s) {
	        
		List<List<String>> list = new ArrayList<>();
		List<String> temp = new ArrayList<>();
		int len = s.length();
		if(len == 0) 
			return list;
		
		String t = "";
		int i = 0 , j = 0;
		
		for( i = 1 ; i <= len; i++) {
			temp.clear();
			for( j = 0; j <= len-i; j += i) {
				t = checkPalindrome(s,j,i+j);
				if(!t.equals(""))
					temp.add(t);
			}
			if(j < len) {
				t = checkPalindrome(s, j, len);
				if(!t.equals(""))
					temp.add(t);
			}
			if(temp.size() != 0)
				list.add(new ArrayList<>(temp));
		}
				
		return list;
	}

	private static String checkPalindrome(String s, int i, int j) {
		String sb = new String(s.substring(i,j));
		int len = sb.length();
		if(len == 1)
			return sb;
		else {
			int counter = 0;
			for( int p = 0 ; p < len/2; p++) {
				if(sb.charAt(p) == sb.charAt(len-p-1)) {
					counter++;
				}
			}
			if(counter == len/2)
				return sb;
			else
				return "";
		}
	}
}
