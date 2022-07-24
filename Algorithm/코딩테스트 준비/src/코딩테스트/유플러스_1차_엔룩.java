package 코딩테스트;

import java.util.*;

public class 유플러스_1차_엔룩 {
	
	static int answer = Integer.MIN_VALUE;
	
	public boolean Posibility(int col, int[] visited) {
		
		for(int i=0; i < col; i++) {
			if(visited[col] == visited[i]) {
				return false;
			}
		}
		
		return true;
	}
	
	public void DFS(int D, int num, int[] visited, int[][] p1) {
		
		
		if(D == num) {
			
			
			int tmp = 0;
			for(int i=0; i < visited.length; i++) {
				
				tmp += p1[i][visited[i]];
			}
			if(tmp > answer) {
				answer = tmp;
			}
			return;
		}
		
		for(int i=0; i < num; i++) {
			visited[D] = i;
			
			if(Posibility(D, visited)) {
				

				DFS(D+1, num, visited, p1);
			}
		}
		
	}
	
	
	public void solution(int num, int[] visited, int[][] p1) {
		
		DFS(0, num, visited, p1);
	}
	
	
	public static void main(String[] args ) {
		
		
		유플러스_1차_엔룩 T = new 유플러스_1차_엔룩();
		
		int[][]  p1 = new int[][] {{12,15}, {19,21}};
		int[][]  p2 = new int[][] {{3,6,8}, {1,4,7}, {2,1,4}};
		
		
		int[] visited = new int[p2.length];
	
		T.solution(p2.length, visited, p2);
		
		System.out.println(answer);
	}
}
