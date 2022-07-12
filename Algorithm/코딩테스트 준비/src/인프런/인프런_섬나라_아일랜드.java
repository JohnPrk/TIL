package 인프런;

import java.util.*;

public class 인프런_섬나라_아일랜드 {

	static int cnt;
	static int[][] board;
	static int answer =0;
	static int[] dx = {1,1,0,-1,-1,-1,0,1};
	static int[] dy = {0,-1,-1,-1,0,1,1,1};
	
	public void DFS(int x, int y) {
		
		for(int i=0; i < dx.length; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			
			if(nx >=0 && nx <cnt && ny >=0 && ny <cnt && board[nx][ny] ==1) {
				board[nx][ny] = 0;
				DFS(nx,ny);
			}
		}
	}
	
	
	public void solution() {
		
		for(int i=0; i < cnt; i++) {
			for(int j =0; j < cnt; j++) {
				
				if(board[i][j] == 1) {
					board[i][j] = 0;
					answer++;
					DFS(i, j);
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		인프런_섬나라_아일랜드 T = new 인프런_섬나라_아일랜드();
		
		Scanner scn = new Scanner(System.in);
		
		
		cnt = scn.nextInt();
		
		board = new int[cnt][cnt];
		
		for(int i=0; i < cnt; i++) {
			for(int j=0; j < cnt; j++) {
				board[i][j] = scn.nextInt();
			}
		}
		
		T.solution();
		
		System.out.println(answer);
	}
}
