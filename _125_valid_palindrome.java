package leetcode;


public class _125_valid_palindrome {

	public static void main(String[] args) {
		String s = "A man, a plan, a canal: Panama";
		s=s.toLowerCase().replaceAll("[^a-z0-9]", "");
		System.out.println(new StringBuilder(s).reverse().toString().equals(s));

	}
}




//return new StringBuilder(s).reverse().toString().equals(s);