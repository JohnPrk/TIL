package 프로그래머스;


import java.util.*;


class Position{
	
	int col;
	int row;
	
	Position() {};
	Position(int col, int row) {
		this.col = col;
		this.row = row;
	}
	
	
}
public class 행렬_테두리_회전하기 {
	
	static int[][] board;
	static int[][] queries;
	
	static int rows;
	static int cols;
	static int[] dx = {0, -1, -0, 1};
	static int[] dy = {1, 0, -1, 0};
	
	public void rollin(int left_col, int left_row, int right_col, int right_row) {
		
		for(int i= left_col; i <= right_col; i++) {
			for(int j= left_row; j <= right_row; j++) {
				
				int cnt=0;
				int tmp=0;
					
					for(int a= 0; a < right_row - left_row; a++) {
						tmp = board[i+dx[cnt]][j+dy[cnt]];		
						board[i+dx[cnt]][j+dy[cnt]] = board[i][j];
					}
					cnt++;
					
					for(int a= 0; a < right_col - left_col; a++) {
						tmp = board[i+dx[cnt]][j+dy[cnt]];		
						board[i+dx[cnt]][j+dy[cnt]] = board[i][j];
					}
					cnt++;
					
					for(int a= 0; a < right_row - left_row; a++) {
						tmp = board[i+dx[cnt]][j+dy[cnt]];		
						board[i+dx[cnt]][j+dy[cnt]] = board[i][j];
					}
					cnt++;
					
					for(int a= 0; a < right_col - left_col; a++) {
						tmp = board[i+dx[cnt]][j+dy[cnt]];		
						board[i+dx[cnt]][j+dy[cnt]] = board[i][j];
					}
					cnt++;
					
					
					
//System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public int[] solution(int rows, int columns, int[][] queries) {
        int[] answer = {};
        
        for(int[] q : queries) {
        	int left_col = q[0]-1;
        	int left_row = q[1]-1;
        	int right_col = q[2]-1;
        	int right_row = q[3]-1;
        	
        	rollin(left_col, left_row, right_col, right_row);
        }
        
        return answer;
    }
	
	
	
	public static void main(String[] args) {
		
		행렬_테두리_회전하기 T = new 행렬_테두리_회전하기();
		
		rows = 6;
		cols = 6;
		
		board = new int[cols][rows];
		queries = new int[][] {{2,2,5,4},{3,3,6,6},{5,1,6,3}};
		
		int cnt=1;
		for(int i=0; i < cols; i++) {
			for(int j=0; j < rows; j++) {
				board[i][j] = cnt;
				cnt++;
			}
		}
		
		
		T.solution(rows, cols, queries);
	}
}
