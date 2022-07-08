package 프로그래머스;

import java.util.*;

public class 위클리_챌린지_최소_직사각형 {
	
	public static int rectangle(int[][] sizes) {
		
		
		
		int max = 0;
		int min = 0;
		
		for(int i = 0; i < sizes.length; i++) {
			int max_number = Math.max(sizes[i][0], sizes[i][1]);
			int min_number = Math.min(sizes[i][0], sizes[i][1]);
			
			max = Math.max(max_number, max);
			min = Math.min(min_number, min);
			
			
		}
		
		int answer = max * min; 
		
		
		return answer;
	}
	
	public static int solution(int[][] sizes) {
		int answer = rectangle(sizes);
	
		return answer;
	}
	
	public static void main(String[] args) {
		
	}
	
	
}
