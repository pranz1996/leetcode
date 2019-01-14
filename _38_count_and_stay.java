package leetcode;

public class _38_count_and_stay {

	public static void main(String[] args) {
		System.out.println(countAndStay(2));
	}

	private static String countAndStay(int n) {
		StringBuilder sb = new StringBuilder("10");
		StringBuilder temp;
		
		int count;
		char c;
		
		int i = 1;
		while(i < n) {
			
			temp = sb;
			sb = new StringBuilder();
			count = 1;
			c = temp.charAt(0);
			
			int len = temp.length();
			for(int j = 1; j < len; j++) {
				if(temp.charAt(j) != c) {
					sb.append(count).append(c);
					count = 1;
					c = temp.charAt(j);
				} else {
					count++;
				}
			}
			sb.append(count).append(c);
			i++;
		}
		
		return sb.toString();
	}

}
