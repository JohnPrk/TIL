package 인프런;

import java.util.*;

public class 인프런_최대_점수_구하기 {
	
	static int cnt;
	static int time_limit;
	static int answer;
	static int[] keys;
	static int[] values;
	
	public void DFS(int D, int sum, int time, int[] keys, int[] values) {
		
		if(time > time_limit) {
			return;
		}
		if(D == cnt) {
			answer = Math.max(answer, sum);
		}else {
			DFS(D+1, sum+keys[D], time+values[D], keys, values);
			DFS(D+1, sum, time, keys, values);
		}
		
		
	}
	
	public void solution(int[] keys, int[] values) {
		
		DFS(0, 0, 0, keys, values);
	}
	
	public static void main(String[] args) {
		
		인프런_최대_점수_구하기 m = new 인프런_최대_점수_구하기();
	
		Scanner scn = new Scanner(System.in);
		
		cnt = scn.nextInt();
		time_limit = scn.nextInt();
		
		
		keys = new int[cnt]; 				
		values = new int[cnt];
		
		for(int i = 0; i < cnt; i++) {
			keys[i] = scn.nextInt();
			values[i] = scn.nextInt();
		}
		
		m.solution(keys, values);
		
		
		System.out.println(answer);
		
		
		

	}
}
