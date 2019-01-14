package leetcode;

public class _9_Palindrome_number {

	public static void main(String[] args) {
		
		int x = -121;
		
		if(x < 0) {
			// return false;
		}
		
		int temp = x ;
		int answer = 0;
		
		while(temp != 0) {
			int reminder = temp % 10;
			answer = (int) (answer * Math.pow(10,Integer.toString(reminder).length()) + reminder);
			if(answer >= Integer.MAX_VALUE)
				System.out.println(0);
			temp = temp/ 10;
		}
			
		if(answer == x) {
			System.out.println(answer + " true");
		} else {
			System.out.println("false");
		}
	}

}
