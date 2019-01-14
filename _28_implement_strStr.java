package leetcode;

public class _28_implement_strStr {

	public static void main(String[] args) {
		System.out.println(strStr("aaaaa","bba"));
	}
	public static int strStr(String haystack, String needle) {
		
		if(needle.length() == 0) {
			return 0;
		}
		
        if(haystack.indexOf(needle) != -1) {
        	return haystack.indexOf(needle);
        } else {
        	return -1;
        }
    }
}
