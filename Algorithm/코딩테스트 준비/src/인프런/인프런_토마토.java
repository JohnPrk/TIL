package 인프런;

import java.util.*;

class Pos {
	int x;
	int y;
	
	Pos(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class 인프런_토마토 {
	
	static Queue<Pos> Q = new LinkedList<>();
	
	
	public void BFS(int[][] board, int[][] dis) {
		
		int[] dx = {0, 1, 0, -1};
		int[] dy = {1, 0, -1, 0};
		
		
		while(!Q.isEmpty()) {
			Pos tmp = Q.poll();
			
			
			for(int i=0; i < dx.length; i++) {
				
				int nx = tmp.x + dx[i];
				int ny = tmp.y + dy[i];
				
				if(nx >=0 && nx <board.length && ny >= 0 && ny < board[0].length) {
					if(board[nx][ny] == 0) {
						
						
						Q.offer(new Pos(nx, ny));
						board[nx][ny] = 1;
						dis[nx][ny] = dis[tmp.x][tmp.y] +1;
					}
				}
			}
		}
		
		
	}
	
	
	public int solution(int[][] board, int[][] dis) {
		
		for(int i=0; i < board.length; i++) { // i => x
			for(int j=0; j < board[0].length; j++) { // j => y
				
				if(board[i][j] == 1) {
					Q.offer(new Pos(i, j));
				}
				
			}
		}
		
		BFS(board, dis);
		int answer = Integer.MIN_VALUE;
		
		
		
		for(int i=0; i < board.length; i++) {
			for(int j =0; j < board[0].length; j++) {
				if(board[i][j] == 0) {
					return -1;
				}
			}
		}
		
		for(int i=0; i < board.length; i++) {
			for(int j =0; j < board[0].length; j++) {
				answer = Math.max(answer, dis[i][j]);	
			}
		}
		
		return answer;
	}
	
	
	public static void main(String[] args) {
	
		인프런_토마토 T = new 인프런_토마토();
		Scanner scn = new Scanner(System.in);
		
		
		int y = scn.nextInt();
		int x = scn.nextInt();
		
		int[][] board = new int[x][y];
		int[][] dis = new int[x][y];
		
		
		for(int i=0; i < x; i++) {
			for(int j=0; j < y; j++) {
				board[i][j] = scn.nextInt();
			}
		}
		
		int answer = T.solution(board, dis);
		
		System.out.println(answer);
	}
}
