package 프로그래머스;


import java.util.*;


public class 행렬_테두리_회전하기 {
	
	static int min = 10010;

	public void DFS(int D,int x, int y, int temp_number, int[][] board, int cnt, int c_cnt, int rowus, int colus) {
		
        int[] dx = {0, 1, -0, -1};
	    int[] dy = {1, 0, -1, 0};
		int[] dz = {rowus, colus,rowus,colus};
		
		
		int tmp =0;
		
		if(D == ((colus) * 2 + (rowus) * 2)) {
			return;
		}
		
		int nx = x + dx[cnt];
		int ny = y + dy[cnt];
		
        
		tmp = board[nx][ny];
        
		if(D == 0) {
			board[nx][ny] = board[x][y];
			if(min > board[x][y]) {
                min = board[x][y];
		    }
        }
		else {
			board[nx][ny] = temp_number;
			if(min > temp_number) {
				min = temp_number;
			}
		}
		
		
		c_cnt++;
		
		if(c_cnt == dz[cnt]) {
			cnt++;
			c_cnt =0;
		}
		
		
		DFS(D+1, nx, ny, tmp, board, cnt, c_cnt, rowus, colus);
		
        
        cnt =0;
		nx =0;
		ny =0;
        
	    }
    

    
	public int[] solution(int rows, int columns, int[][] queries) {
        
		int[] answer = new int[queries.length];
        int[][] board = new int[rows+1][columns+1];
        int cnt=0;
        int c_cnt =0;
        int answer_cnt=0;
        int left_col=0;
		int left_row =0;
        int right_col=0;
        int right_row=0;
        int colus=0;
        int rowus=0;
        
        
        int board_cnt=1;
		for(int i=1; i <= rows; i++) {
			for(int j=1; j <= columns; j++) {	
                board[i][j] = board_cnt;	
                board_cnt++;
		    }
		}
        
        for(int[] q : queries) {
        	left_col = q[0];
        	left_row = q[1];
        	right_col = q[2];
        	right_row = q[3];
        	
        	rowus = right_row-left_row;
        	colus = right_col-left_col;
        	
            
            
        	DFS(0, left_col, left_row, 0, board, cnt, c_cnt, rowus, colus);
        	
            answer[answer_cnt] = min;
        	answer_cnt++;
        	
        	min = 10010;

        }
        
		
        return answer;
    }
	 

	
	public static void main(String[] args) {
		
		행렬_테두리_회전하기 T = new 행렬_테두리_회전하기();
		
		int rows = 6;
		int cols = 6;
		
		
		
		int[][] queries = new int [][]{{2,2,5,4}, {3,3,6,6}, {5,1,6,3}};
		T.solution(rows, cols, queries);
		
		
		
		
		

	}
}
