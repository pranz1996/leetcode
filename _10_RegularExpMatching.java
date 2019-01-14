package leetcode;

public class _10_RegularExpMatching {

	public static void main(String[] args) {
		String s = "aa", p = "a*";
		System.out.println(isMatch(s,p));
	}

	public static boolean isMatch(String s, String p) {
        
		if(s.matches(p)) {
			return true;
		}
		
		return false;
    }
}
