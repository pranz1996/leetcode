package leetcode;

public class LicenceNo {

	public static void main(String[] args) {
		String S = "r"; int K = 1;
		
			StringBuilder sb = new StringBuilder(S);
			for(int i = 0 ; i < sb.length() ; i++) {
				if(sb.charAt(i) == '-')
					sb.deleteCharAt(i);
			}
			int length = sb.length();
			int first = length % K;
					
			int index = K ;
			
			if(first != 0) {
				sb.insert(first, '-');
				index = first + K + 1;
			}
			
			while( index < length) {
				sb.insert(index,'-');
				index += K;
			}
	
			S = sb.toString().toUpperCase();
			System.out.println(S);
	}

}
