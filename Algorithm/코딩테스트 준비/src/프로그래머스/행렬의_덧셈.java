package 프로그래머스;

import java.util.*;

public class 행렬의_덧셈 {

	
	public static int[][] plus(int[][] arr1, int[][] arr2) {
		int[][] answer = new int[arr1.length][arr1[0].length];
        
		
		for(int i =0; i < arr1.length; i++) {
			for(int j =0; j < arr1[0].length; j++) {
				answer[i][j] = arr1[i][j] + arr2[i][j];
			}
		}
		
		
		
		return answer;
	}

	public static int[][] solution(int[][] arr1, int[][] arr2) {
		
		int[][] answer = plus(arr1, arr2);
		
        return answer;
	}
	
	
	public static void main(String[] args) {
		
		solution(new int[][] {{1,2}, {2,3}}, new int[][] {{3,4}, {5,6}});
	
	}
}
