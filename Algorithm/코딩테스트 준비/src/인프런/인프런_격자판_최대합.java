package 인프런;

import java.util.*;

public class 인프런_격자판_최대합 {

	static int cnt;
	static int[][] board;
	static int answer = Integer.MIN_VALUE;
	public void solution() {
		
		for(int i=0; i < cnt; i++) {
			int tmp = 0;
			for(int j=0; j < cnt; j++) {
				tmp += board[i][j];
			}
			if(tmp > answer) {
				answer = tmp;
			}
		}
		
		for(int k=0; k < cnt; k++) {
			int tmp = 0;
			for(int m=0; m < cnt; m++) {
				tmp += board[m][k];
			}
			if(tmp > answer) {
				answer = tmp;
			}
		}
		
		int tmp = 0;
		for(int a=0; a < cnt; a++) {
			tmp += board[a][a];
		}
			
		if(tmp > answer) {
			answer = tmp;
		}
		
		tmp = 0;
		for(int b=cnt-1; b >=0; b--) {
			tmp += board[b][Math.abs(4-b)];
		}
			
		if(tmp > answer) {
			answer = tmp;
		}
		
		
	}
	
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		인프런_격자판_최대합 T = new 인프런_격자판_최대합();
		
		cnt = scn.nextInt();
		board = new int[cnt][cnt];
		
		for(int i=0; i<cnt; i++) {
			for(int j=0; j<cnt; j++) {
				board[i][j] = scn.nextInt();
			}
		}
	
		T.solution();
		
		System.out.println(answer);
	}
}
