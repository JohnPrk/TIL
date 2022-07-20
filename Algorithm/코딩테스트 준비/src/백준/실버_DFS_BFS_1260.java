package 백준;

import java.util.*;

public class 실버_DFS_BFS_1260 {

	static String dfs_answer = "";
	static String bfs_answer = "";
	
	public void BFS(int[][] board, int start_point, boolean[] visited) {
		Queue<Integer> Q = new LinkedList<>();
		
		
		Q.add(start_point);
		
		while(!Q.isEmpty()) {
			
			int tmp = Q.poll();
			
			for(int i=1; i < board[0].length; i++) {
				if(board[tmp][i] == 1 && visited[i] == false) {
					
					bfs_answer += i + " ";
					visited[tmp] = true;
					Q.add(i);
					visited[i] = true;
				}
			}
		}
	}
	
	public void DFS(int[][] board, int start_point, boolean[] visited) {
		
		visited[start_point] = true;
		
		for(int i=0; i < board[0].length; i++) {
			if(board[start_point][i] == 1 && visited[i] == false) {
				dfs_answer += i + " ";
				visited[start_point] = true;
				
				DFS(board, i, visited);
			}
		}
	}
	
	
	
	
	public void solution(int[][] board, int start_point, boolean[] visited) {
		
		dfs_answer += start_point + " ";
		DFS(board, start_point, visited);
	
		visited = new boolean[board.length];
		
		bfs_answer += start_point + " ";
		BFS(board, start_point, visited);
	}
	
	
	public static void main(String[] args) {
		
		실버_DFS_BFS_1260 T = new 실버_DFS_BFS_1260();
		Scanner scn = new Scanner(System.in);
	
		int numbers = scn.nextInt();
		int nodes = scn.nextInt();
		int start_point = scn.nextInt();
		int[][] board = new int[numbers + 1][numbers + 1];
		boolean[] visited = new boolean[numbers+1];
		
		for(int i=0; i < nodes ; i++) {
			int x = scn.nextInt();
			int y = scn.nextInt();
			
			board[x][y] = 1;
			board[y][x] = 1;
		}
		
		T.solution(board, start_point, visited);
		
		System.out.println(dfs_answer.strip());
		System.out.println(bfs_answer.strip());
	}
}
