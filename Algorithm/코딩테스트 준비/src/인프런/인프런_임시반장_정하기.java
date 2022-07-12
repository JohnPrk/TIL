package 인프런;

import java.util.*;

public class 인프런_임시반장_정하기 {

	static int cnt;
	static int[][] board;
	static int answer;
	static int max = Integer.MIN_VALUE;
	
	
	
	public void solution() {
		
		for(int i=0; i < cnt; i++) {
			
			int tmp = 0;
			for(int j=0; j < cnt; j++) {
				
				
				for(int k =0; k < 5; k++) {
					System.out.println(board[i][k] + " ");	
//					if(board[i][k] == board[j][k]) {
//						tmp++;
//						break;
//					}	
				}
				
			}
			if(tmp > max) {
				max = tmp;
				answer = i + 1;
			}	
		}
	}
	
	public static void main(String[] args ) {
		
		인프런_임시반장_정하기 T = new 인프런_임시반장_정하기();
		
		Scanner scn = new Scanner(System.in);
		
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
