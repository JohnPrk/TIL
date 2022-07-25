package 백준;

import java.util.*;

public class DFS_골드_1987 {
	
	static int max = Integer.MIN_VALUE;
	
	public void DFS(int x, int y, int len, int[][] board, boolean[] alphabet) {
		
		int[] dx = {0, 1, 0, -1};
		int[] dy = {1, 0, -1, 0};
		
		alphabet[board[x][y]] = true;
		max = Math.max(max, len);
		
		for(int i=0; i < dx.length; i++) {
			
			int nx = x + dx[i];
			int ny = y + dy[i];
			
			
			if(nx >=0 && nx < board.length && ny >= 0 && ny < board[0].length) {
				
				if(!alphabet[board[nx][ny]]) {
					DFS(nx, ny, len+1, board, alphabet);
					alphabet[board[nx][ny]] = false;
				}
			}
		}
	}
	
	public void solution(int[][] board, boolean[] alphabet) {
		
		DFS(0, 0, 1, board, alphabet);
		
	}
	
	public static void main(String[] args) {
	
		DFS_골드_1987 T = new DFS_골드_1987();
		Scanner scn = new Scanner(System.in);
		
		int x = scn.nextInt();
		int y = scn.nextInt();
		int[][] board = new int[x][y];
		boolean[] alphabet = new boolean[26];
		
		for(int i =0; i < x; i++) {
			char[] tmp_arr = scn.next().toCharArray();
			
			for(int j=0; j < y; j++) {
				board[i][j] = tmp_arr[j] - 'A';
			}
		}
		
		T.solution(board, alphabet);
		System.out.println(max);
		
	}
}
