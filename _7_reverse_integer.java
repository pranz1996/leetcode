package leetcode;

public class _7_reverse_integer {

	public static void main(String[] args) {
		int x = -2147483648;
		if(x <= Integer.MIN_VALUE){
            System.out.print(" yeah");
		}
		boolean flag = false;
		if(x < 0) {
			x = Math.abs(x);
			flag = true;
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
		
		if(flag) {
			answer = -answer;
		}
		
		System.out.println(answer);
	}

}
