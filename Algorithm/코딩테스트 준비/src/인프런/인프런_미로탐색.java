package 인프런;

import java.util.*;

public class 인프런_미로탐색 {
	
	static int[] dx = {0,1,0,-1};
	static int[] dy = {1,0,-1,0};
	static int[][] board;
	static int answer = 0;
	
	
	
	public void DFS(int x, int y) {
	
		
		if(x == 7 && y == 7) {
			answer ++;
		}
		else {
			for(int k =0; k < 4; k++) {
				int nx = x + dx[k];
				int ny = y + dy[k];
				
				if(nx >=1 && nx <=7 && ny >=1 && ny <=7 && board[nx][ny] ==0) {
					board[nx][ny] = 1;
					System.out.println(nx + " " + ny);
					DFS(nx, ny);
					board[nx][ny] = 0;
				}
			}
		}
	}
	
	
	
	public void solution() {
		
		
		Scanner scn = new Scanner(System.in);
		
		board = new int[8][8];
		
		for(int i =1; i <= 7; i++) {
			for(int j = 1; j <= 7; j++) {
				board[i][j] = scn.nextInt();
			}
		}
		
		board[1][1] = 1;
		DFS(1,1);
		
	
	}
	
	public static void main(String[] args) {
		
		인프런_미로탐색 m = new 인프런_미로탐색();
		m.solution();
		
		System.out.println(answer);
	
	}
}
