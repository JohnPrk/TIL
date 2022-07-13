package 백준;

import java.util.*;

public class 골드_DFS_9663 {

	static int cnt;
	static int[][] board;
	static int[] dx = {1,1,0,-1,-1,-1,0,1};
	static int[] dy = {0,-1,-1,-1,0,1,1,1};
	static int max = Integer.MIN_VALUE;
	
	public void DFS(int x, int y) {
	
		if(board[x][y] == 1) {
			return;
		}
		
		board[x][y] = 1;
		
		for(int i=0; i < dx.length; i++) {
			
			int nx = x + dx[i];
			int ny = y + dy[i];
		
			if(nx >= 0 && nx < cnt && ny >= 0 && ny < cnt) {
				if(board[nx][ny] ==0) {
					DFS(nx, ny);
				}
			}
		}
		
		
	}
	
	
	public void solution() {
		
		board = new int[cnt][cnt];
		
		for(int i=0; i < board.length; i++) {
			for(int j=0; j < board[0].length; j++) {
				
				DFS(i, j);
			}
		}
	}
	
	public static void main(String[] args) {
		
		골드_DFS_9663 T = new 골드_DFS_9663();
		
		
		Scanner scn = new Scanner(System.in);
		
		cnt = scn.nextInt();
		
		
		T.solution();
	}
}
