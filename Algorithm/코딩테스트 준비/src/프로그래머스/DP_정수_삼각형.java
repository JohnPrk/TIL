package 프로그래머스;
import java.util.*;
public class DP_정수_삼각형 {
	
	public static void main(String[] args) {
		int max = Integer.MIN_VALUE;
		int[][] triangle = new int[][] {{7}, {3,8}, {8,1,0}, {2,7,4,4}, {4,5,2,6,5}};
		int[][] board = new int[triangle.length][triangle.length];
		int[][] dp = new int[board.length][board[0].length];
		
		for(int i=0; i < triangle.length; i++) {
			for(int j=0; j < triangle[i].length; j++) {
//				System.out.println(i + " " + j);
//				System.out.println(triangle[i][j]);
				board[i][j] = triangle[i][j];
			}
		}
		dp[0][0] = board[0][0];
		for(int i =1;i < board.length; i++) {
			for(int j =0; j <board[0].length; j++) {
				if(j == 0) {
					dp[i][j] = board[i][j] + dp[i-1][j];
				}else if(j == board[0].length-1) {
					dp[i][j] = board[i][j] + dp[i-1][j-1];
				}else {
					dp[i][j] = Math.max(board[i][j] + dp[i-1][j-1], board[i][j] + dp[i-1][j]);
				}
			}
		}
		for(int i=0; i < dp[0].length; i++) {
			max = Math.max(max, dp[dp.length-1][i]);
		}
		System.out.println(max);
	}
}
