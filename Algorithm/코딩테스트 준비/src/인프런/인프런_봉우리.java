package 인프런;
	
import java.util.*;

public class 인프런_봉우리 {

	static int cnt;
	static int[][] board;
	static int[] dx = {1, 0, -1, 0};
	static int[] dy = {0, -1, 0, 1};
	static int answer = 0;
	
	
	public void DFS(int x, int y) {
		
		int tmp = 0;
		
		for(int i =0; i < dx.length; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			
			if(nx >= 0 && nx < cnt+2 && ny >=0 && ny < cnt+2) {
				if(board[x][y] > board[nx][ny]) {
					tmp++;
					
				}
			}
		}
		if(tmp == 4) {
			answer ++;
		}
	}
	
	public void solution() {
	
		for(int i=0; i< cnt+2; i++) {
			for(int j=0; j <cnt+2; j++) {
				DFS(i, j);
			}
		}
	}
	
	
	public static void main(String[] args) {
		
		인프런_봉우리 T = new 인프런_봉우리();
		
		Scanner scn = new Scanner(System.in);
	
		cnt = scn.nextInt();
		board = new int[cnt+2][cnt+2];
		
		for(int i=0; i<cnt+2; i++) {
			for(int j=0; j<cnt+2; j++) {
				if(i ==0 || j ==0  || i == cnt+1 || j == cnt+1) {
					board[i][j] = 0;
				}
				else {
					board[i][j] = scn.nextInt();
				}
			}
		}
		
		
		T.solution();
		
		System.out.println(answer);
	}
}