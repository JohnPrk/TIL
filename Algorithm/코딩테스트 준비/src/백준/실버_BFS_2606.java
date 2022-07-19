package 백준;

import java.util.*;



public class 실버_BFS_2606 {

	static int answer;
	static Queue<Integer> Q;
	
	public void BFS(int[][] board, boolean[] visited) {
		
		Q.add(1);
		visited[1] = true;

		
		while(!Q.isEmpty()) {
			
			int tmp = Q.poll();
			
			for(int i =1; i < board[0].length; i++) {
				if(board[tmp][i] == 1 && !visited[i]) {
					
					visited[i] = true;
					Q.add(i);
					answer++;
				}
			}
		
		}
	
	
	}
	
	
	public void solution(int[][] board, boolean[] visited) {
		
		
		BFS(board, visited);

		
	}
	
	
	public static void main(String[] args) {
		
		실버_BFS_2606 t = new 실버_BFS_2606();
		
		Scanner scn = new Scanner(System.in);
		
		int computer = scn.nextInt();
		int connection = scn.nextInt();
		
		int[][] board = new int[computer+1][computer+1];
		boolean[] visited = new boolean[computer+1];
		
		Q = new LinkedList<>();
		
		for(int i =1; i <= connection; i++) {
			
			int start_point = scn.nextInt();
			int end_point = scn.nextInt();
			
			board[start_point][end_point] = 1;
			board[end_point][start_point] = 1;
			
		}
		
		
		t.solution(board, visited);
		
		
		
		
		System.out.println(answer);
		
		
	}
}
