package 백준;


import java.util.*;



public class 백트래킹_골드_9663 {
	
	static int cnt =0;
	
	public boolean Possibility(int col, int[] visited) {
		
		for(int i=0; i < col; i++) {
			
			if(visited[col] == visited[i]) {
				return false;
			}
			if(Math.abs(col -i) == Math.abs(visited[i] - visited[col])) {
				return false;
			}
		}
		return true;
			
	}
	
	public void DFS(int D, int num, int[] visited) {
		
	
		if(D == num) {
			cnt ++;
			return;
		}
		
		 
		
		for(int i=0; i < num; i++) {
			visited[D] =i;
			
			if(Possibility(D, visited)) {
				
				DFS(D+1, num, visited);
			}
		}
	}
		
		
		
		
	
	
	
	public void solution(int num, int[] arr, int cnt) {
		
		
		
		DFS(0, num, arr);
			
		
	
		
	}
	
	
	
	public static void main(String[] args) {
		
		백트래킹_골드_9663 T = new 백트래킹_골드_9663();
		Scanner scn = new Scanner(System.in);
		
		
		int num = scn.nextInt();
		int[] visited = new int[num];
		
		
		T.solution(num, visited, cnt);
		
		System.out.println(cnt);
	}
}
