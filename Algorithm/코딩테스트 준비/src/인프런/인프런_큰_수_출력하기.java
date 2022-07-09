package 인프런;

import java.util.*;

public class 인프런_큰_수_출력하기 {
	
	public static String bigger(int[] num_arr) {
		String answer = "";
		
		answer += num_arr[0];
		answer += " ";
		
		for(int i = 1; i < num_arr.length ; i++) {
				
			if(num_arr[i-1] <= num_arr[i]) {
				answer += num_arr[i];
				answer += " ";
			}
			
			
		}
		
		answer = answer.substring(0, answer.length() -1);
		
		return answer;
	}
	
	public static String solution(int[] num_arr) {
		
		String answer = bigger(num_arr);
		
		return answer;
	}
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int num = scn.nextInt();
		scn.nextLine();
		String[] str_arr = scn.nextLine().split(" ");
		
		int[] num_arr = new int[str_arr.length];
		
		int cnt = 0;

		for(String s : str_arr) {
			num_arr[cnt] = Integer.parseInt(s);
			cnt++;
		}
		
		String answer = solution(num_arr);
		
		System.out.println(answer);
	}
}
