package 인프런;

import java.util.*;

public class 인프런_조합의_경우의_수 {
	
	static int answer;
	static int[][] board = new int[35][35];
	
	public int DFS(int n, int c) {
		if(n == c || c ==0) {
			return 1;
		}else {
			if(board[n][c] >0) {
				return board[n][c];
			}
			board[n][c] = DFS(n-1,c-1) + DFS(n-1, c);
			return board[n][c];
		}
		
	}
	
	
	public int solution(int n, int c) {
		int answer = DFS(n,c);
	
		return answer;
	}
	
	public static void main(String[] args) {
		
		인프런_조합의_경우의_수 T = new 인프런_조합의_경우의_수();
		
		
		Scanner scn = new Scanner(System.in);
		
		int n = scn.nextInt();
		int c = scn.nextInt();
		
		int answer = T.solution(n, c);
	
		System.out.println(answer);
	}
}
