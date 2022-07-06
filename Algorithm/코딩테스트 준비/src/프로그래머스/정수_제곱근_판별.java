package 프로그래머스;

import java.util.*;

public class 정수_제곱근_판별 {

	public static long rootCheck(long n) {
		
		int num = (int) Math.sqrt(n);
		
		for(int i = 1; i <= num ; i++) {
			if (Math.pow(i, 2) == n) {
				return (long) Math.pow(i+1, 2);
			}
		}
		
		return -1;
	}
	public static long solution(long n) {
		
		long answer = rootCheck(n);
		
		return answer;
	}
	
	public static void main(String[] args) {
		
		int answer = (int) solution(121);
	
		System.out.println(answer);
	}
}
