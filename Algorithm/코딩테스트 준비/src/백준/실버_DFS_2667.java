package 백준;

import java.util.*;

public class 실버_DFS_2667 {

	static int cnt;
	static int[][] board;
	static int[] dx = {-1,0,1,0};
	static int[] dy = {0,1,0,-1};
	static int answer1;
	static int tmp;
	static String str_answer_tmp="";
	
	
	public void DFS(int x, int y) {
		if(board[x][y] == 0) {
			return;
		}
		tmp++;
		board[x][y] = 0;
		
		for(int i=0; i < dx.length; i++) {
			
			int nx = x + dx[i];
			int ny = y + dy[i];
			
			if(nx >= 0 && nx < cnt && ny >=0 && ny < cnt) {
				if(board[nx][ny] ==1) {
					DFS(nx, ny);
				}
			}
		}
		
	}
	
	
	public void solution() {
		
		for(int i=0; i < board.length; i++) {
			for(int j=0; j < board[0].length; j++) {
				if(board[i][j] == 1) {
					answer1++;
					tmp =0;
					DFS(i, j);
					str_answer_tmp += tmp + " ";
				}
				
			}
		}
	}
	
	public static void main(String[] args) {
		
		실버_DFS_2667 T = new 실버_DFS_2667();
		
		Scanner scn = new Scanner(System.in);
		
		cnt = scn.nextInt();
		board= new int[cnt][cnt];
		
		for(int i=0; i < cnt; i++) {
			String[] tmp_arr = scn.next().split("");
			for(int j =0; j < tmp_arr.length; j++) {
				board[i][j] = Integer.parseInt(tmp_arr[j]);
			}
		}
		
		T.solution();
		
		String[] str_arr = str_answer_tmp.split(" ");
		int[] int_arr = new int[str_arr.length];
		
		for(int j =0; j < str_arr.length; j++) {
			int_arr[j] = Integer.parseInt(str_arr[j]);
		}
		
		Arrays.sort(int_arr);
		
		
		System.out.println(answer1);
		

		for(int ia : int_arr) {
			System.out.println(ia);
		}
	}
}
