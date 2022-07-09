package 인프런;

import java.util.*;

public class 인프런_뒤집은_소수 {

	static Scanner scn = new Scanner(System.in);
	
	public static String sosu(int[] int_arr) {
		
		String answer = "";
		
		for(int i : int_arr) {
			
			int cnt = 0;
			
			if(i == 1) {
				continue;
			}
			
			for(int j = 2; j <= Math.sqrt(i); j++) {
				
				if(i % j == 0) {
					cnt ++;
					break;
				}
			}
			if(cnt == 0) {
				answer += i;
				answer += " ";
			}
		}
		answer = answer.substring(0, answer.length() -1);
		
		return answer;
	}
	
	public static int[] reverse(String[] str_arr) {
		int[] answer = new int[str_arr.length];
		
		int cnt= 0;
		
		
		for(String s : str_arr) {
			String reverse = "";
			
			
			for(int i = s.length()-1 ; i >= 0 ; i--) {
				reverse += s.charAt(i);
			}
			
			answer[cnt] = Integer.parseInt(reverse);
			cnt ++;
		}
		
		return answer;
	}
	
	public static String solution(String[] str_arr) {
		
	
		int[] int_arr = reverse(str_arr);
		String answer = sosu(int_arr);
		
		return answer;
		
		
	}
	
	public static void main(String[] args) {
		
		
		int num = scn.nextInt();
		scn.nextLine();
		
		String[] str_arr = scn.nextLine().split(" ");
		
		String answer = solution(str_arr);
		
		System.out.println(answer);
		 
		
		
		
	}
}
