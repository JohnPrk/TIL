package 인프런;

import java.util.*;

public class 인프런_등수_구하기 {

	static int[] int_arr;
	static String answer = "";
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
	
		int cnt = scn.nextInt();
		
		int_arr = new int[cnt];
		
		for(int i=0; i < cnt; i++) {
			int_arr[i] = scn.nextInt();
		}
		
	
		for(int j=0; j< cnt; j++) {
			int tmp = 1;
			for(int k =0; k < cnt; k++) {
				if(int_arr[j] < int_arr[k]) {
					tmp++;
				}
			}
			
			answer += tmp;
			answer += " ";
			
			
		}
	
		answer.trim();
		
		System.out.println(answer);
		
			
		
	}
}
