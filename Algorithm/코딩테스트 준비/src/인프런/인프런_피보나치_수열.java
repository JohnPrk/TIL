package 인프런;

import java.util.*;

public class 인프런_피보나치_수열 {

	
	public static int[] fibonacci(int num) {
		int[] answer = new int[num];
		
		answer[0] = 1;
		answer[1] = 1;
		
		for(int i = 2; i < num ; i++) {
			answer[i] = answer[i-1] + answer[i-2];
		}
		
		
		return answer;
		
	}
	
	public static String solution(int num) {
		String answer = "";
		
		int[] fibo = fibonacci(num);
		
		for(int f : fibo) {
			answer += f;
			answer += " ";
		}
		answer = answer.substring(0, answer.length());
	
		return answer;
	}
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int num = scn.nextInt();
		
		String answer = solution(num);
		
		System.out.println(answer);
	}
}
