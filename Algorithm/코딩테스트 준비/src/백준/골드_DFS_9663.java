package 백준;

import java.util.*;

public class 골드_DFS_9663 {

	static int cnt;
	
	public boolean Possibility(int D, int[] position) {
		
		for(int i=0; i < D; i++) {
			if(position[D] == position[i]) {
				return false;
			}
			
			if(Math.abs(D- i) == Math.abs(position[D] - position[i])) {
				return false;
			}
		}
		
		return true;
	}
	
	public void DFS(int D, int num, int[] position) {
		
		if(D == num) {
			cnt++;
			return;
		}
		
		for(int i=0; i < num; i++) {
			
			position[D] = i;
			
			if(Possibility(D, position)) {
				
				DFS(D+1, num, position);
			}
		}
		
	}
	
	public void solution(int num, int[] position) {
		
		
		DFS(0, num, position);
	}
	
	public static void main(String[] args) {
		
		골드_DFS_9663 T = new 골드_DFS_9663();
		Scanner scn = new Scanner(System.in);
		
		int num = scn.nextInt();
		int[] position = new int[num]; 
		
		
		T.solution(num, position);
		System.out.println(cnt);
		
	}
}
