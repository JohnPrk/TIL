package 인프런;

import java.util.*;


public class 인프런_점수_계산 {
	
	static int num;
	static int answer;
	
	
	public static void main(String[] args) {
		
		Scanner scn= new Scanner(System.in);
		
		num = scn.nextInt();
		
		int etc =0;
		boolean isTrue = false;
		
		
		for(int i=0; i < num; i++) {
			
			
			int tmp = scn.nextInt();
			
			if(tmp ==1) {
				if(isTrue) {
					answer += 1;
					answer += etc;
					
				}else {
					answer += 1;
				}
				isTrue = true;
				etc++;
			}else {
				etc =0;
				isTrue = false;
			}
		}
	
	System.out.println(answer);
	}
}
