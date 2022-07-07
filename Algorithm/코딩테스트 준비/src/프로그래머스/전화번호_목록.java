package 프로그래머스;

import java.util.*;

public class 전화번호_목록 {
	
	public static boolean prefix(String[] phone_book) {
		
		boolean answer = true; 
		Arrays.sort(phone_book);
		
		
		for(int i = 1; i < phone_book.length; i++) {
			
			if(phone_book[i].startsWith(phone_book[i-1])) {
				answer = false;
				break;
			}
		}
		return answer;
		
		
	}
	
	public static boolean solution(String[] phone_book) {
		
		boolean answer = prefix(phone_book);
		
		return answer;
	}
	
	public static void main(String[] args) {
		
		String[] phone_book = new String[] {"12","123","1235","567","88"};
		
		boolean answer = solution(phone_book);
		
		System.out.println(answer);
	}
}
