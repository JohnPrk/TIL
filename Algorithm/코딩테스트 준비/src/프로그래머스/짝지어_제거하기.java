package 프로그래머스;

import java.util. *;

public class 짝지어_제거하기 {

	
	

	
	public int solution(String s) {
		
		
		Stack<Character> stack = new Stack<>();
		
		for(char c : s.toCharArray()) {
			if(!stack.isEmpty() && stack.peek() == c) {
				stack.pop();
			}else {
				stack.push(c);
			}
			
			
		}
		
		return stack.isEmpty() ? 1: 0;	
		
	}
	
	public static void main(String[] args) {
		
		짝지어_제거하기 T = new 짝지어_제거하기();
		
		String s = "baabaa";
		
		
		int answer = T.solution(s);
		
		System.out.println(answer);
	}
}
