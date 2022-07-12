package 백준;

import java.util.*;

public class 골드_DFS_알파벳 {
	
	static int cnt;
	static int alphabet_cnt;
	static String[][] board;
	static int[] dx = {1, 0, -1, 0};
	static int[] dy = {0, -1, 0, 1};
	static ArrayList<String> list;
	
	
	public void DFS(int D, int x, int y) {
		
		if(D == cnt * alphabet_cnt  + 1) {
			return;
		}
		
		list.add(board[x][y]);
		
		for(int i=0; i< dx.length; i++) {
			
			
		}
	}
	
	
	
	
	
	public void solution() {
		
		list = new ArrayList<>();
		DFS(0, 0, 0);
	}
	
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		cnt = scn.nextInt();
		alphabet_cnt = scn.nextInt();
		
		for(int i=0; i < cnt; i++) {
			String[] tmp_arr = scn.next().split("");
			
			for(int j=0; j < tmp_arr.length; j++) {
				board[i][j] = tmp_arr[j];
			}
		}
		
		
		
	}
}
