package 프로그래머스;

import java.util.*;

public class 스택_큐_기능_개발 {
	
	public static int[] develop_period(int[] progresses, int[] speeds) {
		
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i = 0; i < progresses.length; i++) {
			
			// 1. 작업 시간 구하기
			
			int day = (int) Math.ceil((100 - progresses[i]) / (speeds[i] * 1.0));
			
			// 2. 뒤에 있는 작업 시간 구하기
			
			int j = i+1;
			
			
			for(; j < progresses.length; j++) {	
				
				if(progresses[j] + day * speeds[j] < 100) {
					break;
				}
			}	
			
			list.add(j-i);
			i = j-1;
		}
		
		int[] answer = new int[list.size()];
		int cnt = 0;
		
		for(int lst : list) {
			answer[cnt] = lst;
			cnt++;
		}
		return answer;	
	}
	
	
	public static int[] solution(int[] progresses, int[] speeds) {
		
		int[] answer = {};
		
		develop_period(progresses, speeds);
		
		return answer; 
	}
	public static void main(String[] args) {
		
		int[] progresses = new int[] {93, 30, 55};
		int[] speeds = new int[] {1, 30, 5};
		
		solution(progresses, speeds);
		
	}
}
