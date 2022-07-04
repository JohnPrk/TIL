package 백준;

import java.util.*;

public class 브론즈_2750 {
		
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
			
		int cnt = scn.nextInt();
			
		int[] answer = new int[cnt];
			
		for(int i = 0; i < cnt; i ++) {
			answer[i] = scn.nextInt();
		}
			
		Arrays.sort(answer);
			
		for(int j : answer) {
			System.out.println(j);
		}
	}
}
