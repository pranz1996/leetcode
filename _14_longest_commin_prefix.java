package leetcode;

public class _14_longest_commin_prefix {

	public static void main(String[] args) {
		String[] str = {"flower","flow","flight"};
		System.out.println(longestCommonPrefix(str));
	}
	public static String longestCommonPrefix(String[] strs) {
       
       if(strs == null || strs.length == 0)
    	   return "";
       if(strs.length == 1)
    	   return strs[0];
       
       String prefix = strs[0];
       int i = 1;
       while(i < strs.length) {
    	   while(strs[i].indexOf(prefix) != 0) {
    		   prefix = prefix.substring(0,prefix.length()-1);
    	   }
    	   i++;
       }
       return prefix;
    }
}
