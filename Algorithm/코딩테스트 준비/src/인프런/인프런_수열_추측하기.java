package 인프런;

import java.util.*;

public class 인프런_수열_추측하기 {

	static int num_cnt;
	static int number;
	static int[] combi = new int[num_cnt];
	static int[][] board = new int[12][12];
	
	public void DFS2(int x) {
		
	}
	
	
	public int DFS(int x, int y) {
		if(y == 0 || x == y) {
			return 1; 
		}else {
			if(board[x][y] > 0) {
				return board[x][y];
			}
			board[x][y] = DFS(x-1, y-1) + DFS(x-1, y);
			return board[x][y];
		}
		
	}
	
	
	public void combination(int D) {
		
		for(int i =0; i < D; i++) {
			combi[i] =DFS(D-1, i); 
		}
		
		for(int j = 1; j <= num_cnt; j++) {
			DFS2(j);
		}
		
	
	}
	
	public void solution() {
		
		
	}
	
	
	public static void main(String[] args) {
		
		인프런_수열_추측하기 T = new 인프런_수열_추측하기();
		
		Scanner scn = new Scanner(System.in);
		
		
		num_cnt = scn.nextInt();
		number = scn.nextInt();
		
		combi = new int[num_cnt];
		T.combination(num_cnt);
	
		
		
		for(int c : combi) {
			System.out.println(c);
		}
	}
	
}
