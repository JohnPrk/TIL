package 프로그래머스;

import java.util.*;

public class 두_정수_사이의_합 {
	
	public static long plus(int n, int m) {
		
		long answer = 0;
		
		int i = Math.min(n, m);
		for(; i <= Math.max(n, m); i++) {
			answer += i;
		}
		
		return answer;
	}
	
	public static long solution(int n, int m) {
		
		long answer = plus(n, m);
		
		
		return answer;
	}
	
	public static void main(String[] args) {
		
		long answer = solution(3, 3);
		
		System.out.println(answer);
	}
}
