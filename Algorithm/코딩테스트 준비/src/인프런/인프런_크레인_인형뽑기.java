package 인프런;
import java.util.*;
public class 인프런_크레인_인형뽑기 {
	static int answer;
	public static void operation(int[][] board, int[] order, Stack<Integer> stack) {
		for(int i =0; i < order.length; i++ ) {
			int n = order[i] -1;
			for(int j =0; j < board.length; j++) {
				if(board[j][n] != 0) {
					if(stack.isEmpty()) {
						stack.add(board[j][n]);
						board[j][n] = 0;
						break;
					}else {
						if(stack.peek() == board[j][n]) {
							answer += 2;
							stack.pop();
							board[j][n] = 0;
							break;
						}else {
							stack.add(board[j][n]);
							board[j][n] = 0;
							break;
						}
					}
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int size = scn.nextInt();
		int[][] board = new int[size][size];
		Stack<Integer> stack = new Stack<>();
		answer = 0;
		for(int i =0; i < size; i++) {
			for(int j=0; j < size; j++) {
				board[i][j] = scn.nextInt();
			}
		}
		int crane = scn.nextInt();
		int[] order = new int[crane];
		for(int i =0; i < crane; i++) order[i] = scn.nextInt();
		operation(board, order, stack);
		System.out.println(answer);
	}
}
