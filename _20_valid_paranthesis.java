package leetcode;

import java.util.Stack;

public class _20_valid_paranthesis {

	public static void main(String[] args) {
		String p[] = {"{}[]()","{[}]}"};
		String arr[] = isValid(p);
		for(int i = 0; i < p.length; i++)
			System.out.println(arr[i]);
	}
	 public static String[] isValid(String values[]) {
		 
		 
		 String answer[] = new String[values.length];
		 
		 for(int k = 0; k < values.length; k++)
			 answer[k] = "";
		 
	        for(int j = 0; j < values.length; j++) {
	            Stack<Character> st = new Stack<>();
	            String s = values[j];
	            for(int i = 0; i < s.length(); i++) {
	                if(s.length() == 1) {
	                    answer[j] = "NO";
	                } else if(s.charAt(i) == '{' || s.charAt(i) == '(' || s.charAt(i) == '[') {
	                    st.push(s.charAt(i));
	                } else if(s.charAt(i) == '}') { 
	                    if(st.isEmpty()) {
	                        answer[j] = "NO";
	                    } else if(st.peek() == '{'){
	                        st.pop();
	                    } else {
	                        answer[j] = "NO";
	                    }
	                } else if(s.charAt(i) == ')') {
	                    if(st.isEmpty()) {
	                        answer[j] = "NO";
	                    } else if(st.peek() == '(') {
	                        st.pop();
	                    } else {
	                        answer[j] = "NO";
	                        
	                    }
	                } else if(s.charAt(i) == ']') {
	                    if(st.isEmpty()) {
	                        answer[j] = "NO";
	                        
	                    } else if(st.peek() == '[') {
	                        st.pop();
	                    } else {
	                        answer[j] = "NO";
	                        
	                    }
	                }
	            }
	            if(st.isEmpty() && answer[j] == "") {
	                answer[j] = "YES";
	               
	            } else if(!st.isEmpty() && answer[j] == ""){
	                answer[j] = "NO";
	               
	            }
	        }
	        return answer;
	 }
}
