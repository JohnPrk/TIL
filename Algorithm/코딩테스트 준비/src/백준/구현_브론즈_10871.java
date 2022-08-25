package 백준;

import java.util.*;

public class 구현_브론즈_10871 {

	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int num = scn.nextInt();
		int max_num = scn.nextInt();
		int tmp =0;
		String answer = "";
		for(int i =0; i < num; i++) {
			tmp = scn.nextInt();
			
			if(tmp < 5) {
				answer += tmp + " ";
			}
		}
		answer = answer.trim();
		
		System.out.println(answer);
	}
}
