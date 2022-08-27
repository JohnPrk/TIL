package 백준;

import java.util.*;

public class 구현_골드_2931 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int row = scn.nextInt()-1;
		int column = scn.nextInt()-1;
		String[][] board = new String[row][column];
		
		for(int i=0; i < row; i++) {
			for(int j=0; j<column; j++) {
				board[i][j] = scn.next();
			}
		}
		
		for(int i=0; i < row; i++) {
			for(int j=0; j <column; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
	}
}
