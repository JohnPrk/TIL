package 프로그래머스;

import java.util.*;

public class 카카오_크레인_인형_뽑기 {
	
	public int solution(int[][] board, int[] moves) {
        int answer = 0;
        
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        for(int m : moves) {
            for(int i=0; i < board[m-1].length ; i++) {
                if(board[i][m-1] != 0) {
                    if(stack.peek() == board[i][m-1]){
                        answer += 2;
                        stack.pop();
                    }else {
                        stack.push(board[i][m-1]);
                    }
                    board[i][m-1] = 0;
                    break;
                }
            }
        }
        
        return answer;
    }
}
