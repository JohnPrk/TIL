package 백준;

import java.util.*;

public class 브론즈_분해합 {
	
	
	public static int solution(int num) {
		
		int answer = 0;
		
		for(int i = 1; i < num ; i++) {
			
			int sum = i;
			
			while(i > 0) {
				sum += i % 10;
				i /= 10;
			}
			if(sum + i == num) {
				answer = sum ;
				break;
			}
			
		}
		return answer;
	}
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int num = scn.nextInt();
	
		int answer = solution(num);
		
		System.out.println(answer);
	}
}
