package 인프런;

import java.util.*;

class Position {
	
	int x, y;
	
	Position(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
}

public class 인프런_미로의_최단거리_통로 {

	static int[][] board;
	static int[][] dis;
	
	public void BFS(int x, int y) {
		
		int[] dx = {0,1,0,-1};
		int[] dy = {1,0,-1,0};
		
		Queue<Position> Q = new LinkedList<>();
		Q.offer(new Position(x, y));	
		board[x][y] = 1;
		
		while(!Q.isEmpty()) {
			Position tmp = Q.poll();
			
			for(int i =0; i < dx.length; i++) {
				
				int nx = tmp.x + dx[i];
				int ny = tmp.y + dy[i];
				
				
				if(nx >=1 && nx <=7 && ny >=1 && ny <= 7) {
					if(board[nx][ny] == 0) {
						dis[nx][ny] = dis[tmp.x][tmp.y]+1; 
						Q.offer(new Position(nx, ny));
						board[nx][ny] = 1;
					}
				}
			}
		}
	
	
	}
	
	public static void main(String[] args) {
		
		인프런_미로의_최단거리_통로 T = new 인프런_미로의_최단거리_통로();
		Scanner scn = new Scanner(System.in);
		
		board = new int[8][8];
		dis = new int[8][8];
		int answer = 0; 
		
		for(int i=1; i <8; i++) {
			for(int j=1; j <8; j++) {
				board[i][j] = scn.nextInt();
			}
		}
		
		
		
		T.BFS(1, 1);
		
		if(dis[7][7] == 0) {
			answer = -1;
		}else { 
			answer = dis[7][7];
		}
		System.out.println(answer);
	}
}
