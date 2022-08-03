package 인프런;

import java.util.*;

public class 인프런_공통_원소_구하기 {

	
	public String solution(int[] num1_arr, int[] num2_arr) {
		String answer = "";
		int p1 =0;
		int p2 =0;
		
		Arrays.sort(num1_arr);
		Arrays.sort(num2_arr);
		while(p1 < num1_arr.length && p2 < num2_arr.length) {
			if(num1_arr[p1] == num2_arr[p2]) {
				answer += num1_arr[p1] + " ";
				p1++;
				p2++;
			}else if(num1_arr[p1] > num2_arr[p2]) {
				p2++;
			}else if(num1_arr[p1] > num2_arr[p2]) {
				p1++;
			}
		}
		return answer;
		
	}
	
	public static void main(String[] args) {
	
		
		Scanner scn = new Scanner(System.in);
		인프런_공통_원소_구하기 T = new 인프런_공통_원소_구하기();
		
		int num1 = scn.nextInt();
		int[] num1_arr = new int[num1];
		
		for(int i=0; i < num1; i++) {
			num1_arr[i] = scn.nextInt();
		}
		int num2 = scn.nextInt();
		int[] num2_arr = new int[num2];
		
		for(int i=0; i < num2; i++) {
			num2_arr[i] = scn.nextInt();
		}
		
		
		String answer = T.solution(num1_arr, num2_arr);
		answer = answer.strip();
		System.out.println(answer);
	}
}
