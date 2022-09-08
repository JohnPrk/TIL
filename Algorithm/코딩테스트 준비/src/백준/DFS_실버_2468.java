package 백준;

import java.util.*;
public class DFS_실버_2468 {
	static int answer;
	static int max;
	public static void DFS(int num, int[][] board, int x, int y) {
		int[] dx = new int[] {1, 0, -1, 0};
		int[] dy = new int[] {0, -1, 0, 1};
		if(board[x][y] == 0) {
			return;
		}
		board[x][y] = 0;
		for (int i=0; i < dx.length; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			
			if(nx >=0 && nx < board.length && ny >=0 && ny < board[0].length) {
				if(board[nx][ny] != 0) {
					DFS(num, board, nx, ny);
				}
			}
		}
	}
	public static void solution(int num, int[][] board) {
		int cnt =0;
		int[][] copy = new int[board.length][board[0].length];
		for(int i=0; i < board.length; i++) {
			for(int j=0; j< board[0].length; j++) {
				if(board[i][j] > num) copy[i][j] = board[i][j];
				else copy[i][j] =0;
			}
		}
		for(int i=0; i < copy.length; i++) {
			for(int j=0; j < copy[0].length; j++) {
			}
		}
		for(int i=0; i <copy.length; i++) {
			for(int j=0; j <copy[0].length; j++) {
				if(copy[i][j] != 0) {			
					DFS(num, copy, i, j);
					cnt ++;
				}		
			}
		}
		if(answer < cnt) {
			answer = cnt;
		}
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		int[][] board = new int[num][num];
		answer = Integer.MIN_VALUE;
		max = Integer.MIN_VALUE;
		for(int i=0; i<num; i++) {
			for(int j=0; j <num; j++) {
				int n = scn.nextInt();
				board[i][j] = n;
				max = (n > max) ? n : max;
			}
		}
		for (int i=0; i <= max; i++ ) {
			solution(i, board);
		}
		System.out.println(answer);
	}
}
