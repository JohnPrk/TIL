package 인프런;

import java.util.*;

public class 인프런_소수_에라토스테네스_체 {

	public static int sosu(int num) {
		
		int answer = 0;
		
		for(int i = 2; i <= num; i++) {
			
			int cnt = 0;
			
			for(int j = 2 ; j <= Math.sqrt(i); j++) {
				if(i % j == 0) {
					cnt ++;
					break;
				}
			}
			if(cnt == 0) {
				answer ++;
			}
		}
		
		return answer;
	}
	
	
	public static int solution(int num) {
	
		int answer = sosu(num);
		
		
		
		return answer;
	}
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int num = scn.nextInt();
		
		int answer = solution(num);
		
		System.out.println(answer);
	}
}
