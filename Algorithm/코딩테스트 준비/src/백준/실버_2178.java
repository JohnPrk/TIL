package 백준;

import java.util.*;

public class 실버_2178 {

	
	
	public static int solution(int col, int row, int[][] miro) {
		
		
		int answer = 0;
		
		
		return answer;
	}
	
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		String[] col_row = scn.nextLine().split(" ");
		
		int col = Integer.parseInt(col_row[0]);
		int row = Integer.parseInt(col_row[1]);
		
		int[][] miro = new int[col][row];
		
		for(int i =0; i < col; i++) {
			
			String[] str_arr = scn.nextLine().split("");
			
			for(int j =0; j <row; j++) {
				miro[i][j] = Integer.parseInt(str_arr[i]); 
			}
		}
		
		int answer = solution(0, 0, miro);
		
		System.out.println(answer);
	}
}
