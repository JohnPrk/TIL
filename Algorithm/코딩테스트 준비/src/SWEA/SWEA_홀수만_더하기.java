package SWEA;

import java.util.*;

public class SWEA_홀수만_더하기 {

	static int cnt;
	static int[][] board;
	static String answer;
	static int[] tmp;
	
	
	
	public void solution() {
		
		for(int i=0; i< cnt; i++) {	
			for(int j=0; j <10; j++) {
				if(board[i][j] % 2 != 0) {
					tmp[i] += board[i][j];
				}
			}
		}
		for(int t=0; t <tmp.length; t++) {
			System.out.println("#" + (t+1)+ " " + tmp[t]);
		}
		
	}
	
	public static void main(String[] args) {
		
		SWEA_홀수만_더하기 T = new SWEA_홀수만_더하기();
		
		Scanner scn = new Scanner(System.in);
		
		cnt = scn.nextInt();
		board = new int[cnt][10];
		tmp = new int[cnt];
		
		for(int i=0; i< cnt; i++) {
			
			for(int j=0; j <10; j++) {
				board[i][j] = scn.nextInt();
			}
		}
		
		T.solution();
	}
}
