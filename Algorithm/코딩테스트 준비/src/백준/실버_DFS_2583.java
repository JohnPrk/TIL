package 백준;

import java.util.*;

class Position {
	
	int left_x;
	int left_y;
	int right_x;
	int right_y;
	
	public Position() {}
	public Position(int left_x, int left_y, int right_x,int right_y) {
		this.left_x = left_x;
		this.left_y = left_y;
		this.right_x = right_x;
		this.right_y = right_y;
	}
}

public class 실버_DFS_2583 {
	Position p = new Position();
	
	static int[][] rectangle;
	static int[][] board;
	static int col;
	static int row;
	static int r_cnt;
	static int[] dx = {-1, 0, 1, 0};
	static int[] dy = {0, 1, 0, -1};
	static int answer1;
	static int tmp;
	static String temp = "";
	static String answer2 = "";
	
	public void DFS(int x, int y) {
		if(board[x][y] == 1) {
			return;
		}
		tmp++;
		board[x][y] = 1;
		
		for(int i=0; i < dx.length; i++) {
			
			int nx = x + dx[i];
			int ny = y + dy[i];
			
			if(nx >=0 && nx < col && ny >= 0 && ny < row) {
				if(board[nx][ny] == 0) {
					DFS(nx, ny);
				}
			}
		}
	}
	
	public void fillInBlock() {
		
		for(int i= 0; i <r_cnt; i++) {
			p.left_x = rectangle[i][0];
			p.left_y = rectangle[i][1];
			p.right_x = rectangle[i][2];
			p.right_y = rectangle[i][3];
		
			for(int j = p.left_y; j < p.right_y; j++) {
				for(int k = p.left_x; k < p.right_x; k++) {
					board[j][k] = 1;
				}
			}
		}
		for(int a=0; a<board.length; a++) {
			for(int b=0; b<board[0].length; b++) {
				if(board[a][b] == 0) {
					answer1 ++;
					tmp =0;
					DFS(a,b);
					temp += tmp + " "; 
				}
				
			}
		}
		
		
	}
	
	public static void main(String[] args) {
		
		실버_DFS_2583 T = new 실버_DFS_2583();
		
		Scanner scn = new Scanner(System.in);
	
		
		col = scn.nextInt();
		row = scn.nextInt();
		r_cnt = scn.nextInt();
	
		rectangle = new int[r_cnt][4];
		board = new int[col][row];
		
		for(int i=0; i< r_cnt; i++) {
			for(int j=0; j< 4; j++) {
				rectangle[i][j] = scn.nextInt();
			}
		}
		
		
		T.fillInBlock();
		
		temp.trim();
		
		String[] str_arr = temp.split(" ");
		int[] int_arr = new int[str_arr.length];
		for(int j=0; j < str_arr.length; j++) {
			int_arr[j] = Integer.parseInt(str_arr[j]);
		}
		Arrays.sort(int_arr);
		
		for(int ia : int_arr) {
			answer2 += ia + " ";
		}
		answer2.trim();
		
		System.out.println(answer1);
		System.out.println(answer2);
	}
}
