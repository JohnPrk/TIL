package 인프런;

import java.util.*;

public class 인프런_미로의_최단거리_통로 {

	static int min = Integer.MAX_VALUE;
	
	public void DFS(int x, int y, int[][] board, int[][] dis) {
		
		
		int[] dx = {0, 1, 0, -1};
		int[] dy = {1, 0, -1, 0};
		
		if(board[x][y] == 1) {
			return;
		}
		if(x == 7 && y ==7) {
			
			min = Math.min(min, dis[x][y]);
			return;
		}
		board[x][y] = 1;
		
		for(int i=0; i < dx.length; i++) {
			
			int nx = x + dx[i];
			int ny = y + dy[i];
			
			
			if(nx>=0 && nx<=7 && ny>=0 && ny<=7) {
				if(board[nx][ny] == 0) {
					dis[nx][ny] = dis[x][y] +1;
					DFS(nx, ny, board, dis);
					board[nx][ny] = 0;
				}
				
				
			
				
			}
		}
		
	}
	
	
	public void solution(int[][] board, int[][] dis) {
		
		DFS(1,1, board, dis);
	}
	
	
	public static void main(String[] args) {
		
		int[][] board = new int[8][8];
		int[][] dis = new int[8][8];
		인프런_미로의_최단거리_통로 T = new 인프런_미로의_최단거리_통로();
		Scanner scn = new Scanner(System.in);
	
	
		for(int i=1; i <=7; i++) {
			for(int j=1; j<=7; j++) {
				board[i][j] = scn.nextInt();
			}
		}
		
		
		T.solution(board, dis);
		if(min ==Integer.MAX_VALUE) {
			System.out.println(-1);
		}else {
			System.out.println(min);
		}
		
	}
}
