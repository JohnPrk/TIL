package 프로그래머스;
import java.util.*;
public class 카카오_채용연계형_인턴십_거리두기_확인 {
	public static void DFS(Character[][] board) {
		
	}
	public static void main(String[] args) {
		String[][] places = new String[][] {{"POOOP", "OXXOX", "OPXPX", "OOXOX", "POXXP"}, {"POOPX", "OXPXP", "PXXXO", "OXXXO", "OOOPP"}, {"PXOPX", "OXOXP", "OXPOX", "OXXOP", "PXPOX"}, {"OOOXX", "XOOOX", "OOOXX", "OXOOX", "OOOOO"}, {"PXPXP", "XPXPX", "PXPXP", "XPXPX", "PXPXP"}};
		Character [][] board = new Character[places.length][places[0].length];
		
		for(int i=0; i < 5; i++) {
			for(int j=0; j < 5; j++) {
				for(int k=0; k < places[0][0].length(); k++) {
					board[i][j] = places[i][j].charAt(k);	
				}
				// 코드
				for(int a=0; a < board.length; a++) {
					for(int b=0; b < board[0].length; b++) {
						if(board[a][b] == 'P') {
							DFS(board);
						}
					}
				}
			}
		}
	
	}
}
