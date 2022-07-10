package 인프런;

import java.util.*;

public class 인프런_바둑이_승차 {
	
	static int max;
	static int num;
	static int answer;
	static int[] int_arr;
	static int[] ch;
	
	public void DFS(int L) {
		if(L == num+1) {
			int tmp = 0;
			
			for(int c : ch) {
				tmp += c;
			}
			
			if(tmp > answer && tmp <= max) {
				answer = tmp;
			}
		}else {
			
			ch[L-1] = int_arr[L-1];
			DFS(L+1);
			
			ch[L-1] = 0;
			DFS(L+1);
		}	
		
	}
	
	public void solution() {
		
		DFS(1);
	}
	
	public static void main(String[] args) {
	
		인프런_바둑이_승차 m = new 인프런_바둑이_승차();
		
		Scanner scn = new Scanner(System.in); 
		
		max = scn.nextInt();
		num = scn.nextInt();
		int_arr = new int[num];
		ch = new int[num];
		
		for(int i=0; i < num; i++) {
			int_arr[i] = scn.nextInt();
		}
		
		Arrays.sort(int_arr);
		
		
		
		m.solution();
	
		System.out.println(answer);
	}
}
