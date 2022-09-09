package 인프런;
import java.util.*;
public class 인프런_멘토링 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int student = scn.nextInt();
		int exam = scn.nextInt();
		int[][] board = new int[student+1][exam+1];
		for(int i=1; i <= student; i++) {
			for(int j=1; j <= exam; j++) {
				board[i][j] = scn.nextInt();
			}
		}
		
		for(int b = 1; b <= exam; b++) {
			for(int a =1; a <= exam; a++) {
				System.out.println("a=" +b + " b=" + a);
				for(int c=1; c <=exam; c++) {
					for(int d =1; d <= student; d++) {
						System.out.print(c+ " " + d);
						System.out.println();
						System.out.print(board[c][a] + " " + board[d][a] +" ");
					}
					System.out.println();
				}
			}
		}
		
	}
}
