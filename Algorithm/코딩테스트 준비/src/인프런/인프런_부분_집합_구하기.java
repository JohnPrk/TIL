package 인프런;

import java.util.*;


public class 인프런_부분_집합_구하기 {
	
	
	static int num;
	static int[]ch;
	
	
	public void DFS(int L) {
		
		if(L == num+1) {
			String tmp = "";
			for(int i =1; i<=num; i++) {
				if(ch[i] == 1) {
					tmp += (i + " ");
				}
			}
			tmp.strip();
			System.out.println(tmp);
		}else {
			ch[L] = 1;
			DFS(L+1);
			
			ch[L]=0;
			DFS(L+1);
		}
		
	}
	public void solution() {
	
		DFS(1);
	}
	
	
	public static void main(String[] args) {
		
		인프런_부분_집합_구하기 m = new 인프런_부분_집합_구하기();
	
		num = 3;
		ch = new int[num+1];
		m.solution();
		
		
		ch = new int[num+1];
	
	}
}
