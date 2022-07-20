package 백준;

import java.util.*;

class Pos {
	int x, y;
	
	Pos(int x, int y) {
		this.x = x;
		this.y = y;
	}
}


public class 실버_BFS_2178 {

	static int answer;
	
	
	
	public void BFS(int[][] board, int[][] dis) {
		
		Queue<Pos> Q = new LinkedList<>();
		int[] dx = {0, 1, 0, -1};
		int[] dy = {1, 0, -1, 0};
		
		Q.offer(new Pos(0,0));
		dis[0][0] = 1;
		
		while(!Q.isEmpty()) {
			
			Pos tmp = Q.poll();
			
			for (int i=0; i < dx.length; i++) {
				
				int nx = tmp.x + dx[i];
				int ny = tmp.y + dy[i];
				
				
				if(nx >=0 && nx < board.length && ny >=0 && ny < board[0].length) {
					if(board[nx][ny] == 1) {
						Q.offer(new Pos(nx, ny));
						board[nx][ny] = 0;
						dis[nx][ny] = dis[tmp.x][tmp.y] +1;
					}
				}
			}
		}
		
	}
	
	
	public void solution(int[][] board, int[][] dis) {	
		
		BFS(board, dis);
		
		
	}
	
	
	public static void main(String[] args) {
		
		실버_BFS_2178 T = new 실버_BFS_2178();
		Scanner scn = new Scanner(System.in);
		answer = 0;
		
		
		int x = scn.nextInt();
		int y = scn.nextInt();
	
		String[] str_arr = new String[y];
		
		int[][] board = new int[x][y];
		int[][] dis = new int[x][y];
		
		for(int i =0; i < x; i++) {
			
			str_arr = scn.next().split("");
			
			for(int j =0; j <y; j++) {
				
				board[i][j] = Integer.parseInt(str_arr[j]); 
			}
		}
		
		
		
		T.solution(board, dis);

		
		System.out.println(dis[x-1][y-1]);
	}
}
