package 백준;
import java.util.*;

public class 시뮬레이션_골드_14503 {
	static int answer;
	public static void simulation(int x, int y, int start_x, int start_y, int direction, int[][] board) {
		if(board[x][y] == 0) return;
		board[x][y] = 0;
		answer++;
		if(direction == 0) {
			start_y = start_y -1;
			direction = 3;
			simulation(x,y,start_x, start_y, direction, board);
		}if(direction == 1) {
			
		}if(direction == 2) {
			
		}if(direction == 3) {
			
		}
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		answer = 0;
		int x = scn.nextInt();
		int y = scn.nextInt();
		int[][] board = new int[x][y];
		int start_x = scn.nextInt();
		int start_y = scn.nextInt();
		int direction = scn.nextInt();
		for(int i=0; i < x; i++) {
			for(int j=0; j < y; j++) {
				board[i][j] = scn.nextInt();
			}
		}
		simulation(x,y,start_x, start_y, direction, board);
	}
}
