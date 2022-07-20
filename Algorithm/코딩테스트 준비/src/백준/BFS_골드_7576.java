package 백준;

import java.util.*;


public class BFS_골드_7576 {

	static Queue<Pos> Q;
	static int[][] dis;
	
	public void BFS(int[][] board, int[][] dis) {
		
		
		int[] dx = {0, 1, 0, -1};
		int[] dy = {1, 0, -1, 0};
		
		while(!Q.isEmpty()) {
			
			Pos tmp = Q.poll();
			for(int i=0; i < dx.length; i++) {
				
				int nx = tmp.x + dx[i];
				int ny = tmp.y + dy[i];
				
				
				if(nx >=0 && nx <board.length && ny >=0 && ny< board[0].length) {
					if(board[nx][ny] == 0 && board[nx][ny] != -1) {
						
						board[nx][ny] = 1;
						Q.offer(new Pos(nx, ny));
						dis[nx][ny] = dis[tmp.x][tmp.y]+1; 
					}
				}
			}
		}
		
	}
	
	public void solution(int[][] board, int[][] dis) {
		
		
		for(int i =0; i<board.length; i++) {
			for(int j=0; j < board[0].length; j++) {
				
				if(board[i][j] == 1) {
					Q.offer(new Pos(i, j));
					dis[i][j] = 1;
				}
			}
		}
		
		BFS(board, dis);
	}
	
	public static void main(String[] args) {
		
		BFS_골드_7576 T = new BFS_골드_7576();
		Scanner scn = new Scanner(System.in);
		Q = new LinkedList<>();
		
		int answer = Integer.MIN_VALUE;
		
		int y = scn.nextInt();
		int x = scn.nextInt();
		
		int[][] board = new int[x][y];
		dis = new int[x][y];
		
		for(int i=0; i < x; i++) {
			for(int j =0; j < y; j++) {
				
				board[i][j] = scn.nextInt();
				if(board[i][j] == -1) {
					dis[i][j] = -1;
				}
			}
		}
		
		T.solution(board, dis);
		
		
		for(int i=0; i < dis.length; i++) {
			for(int j=0; j <dis[0].length; j++) {
				
				if(dis[i][j] == 0) {
					System.out.println(-1);
					return;
				}
			}
			
		}
		
		for(int i=0; i < dis.length; i++) {
			for(int j=0; j <dis[0].length; j++) {
					
				answer = Math.max(answer, dis[i][j]);	
				
			}
		}
		
		System.out.println(answer-1);
	}
}
