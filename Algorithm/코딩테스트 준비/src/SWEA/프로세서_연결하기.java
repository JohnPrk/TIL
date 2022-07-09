package SWEA;

import java.util.*;

public class 프로세서_연결하기 {
	
	static Scanner scn = new Scanner(System.in);
	
	public static int[][] makeIntArray(int test_case) {
		
		int[][] answer = {};
		
		for(int i = 0; i < test_case ; i++) {
			int core_cnt = scn.nextInt();
			
			answer = new int[core_cnt][core_cnt];
			
			int int_cnt = 0;
			for (int j = 0; j < core_cnt ; j++) {
				
				String[] str_arr = scn.nextLine().split(" ");
				
				int[] int_arr = new int[str_arr.length];
			
				int cnt = 0;
				for(String s : str_arr) {
					int_arr[cnt] = Integer.parseInt(s);
				}
				
				for(int k : int_arr) {
					answer[int_cnt][j] = k;
				}
				int_cnt++;
				
			}
		}
		return answer;
	}
	public static String solution(int test_case) {
		
		String answer = "";
		
		makeIntArray(test_case);
	
		return answer;
	}
	
	public static void main(String[] args) {
		
	int test_case = scn.nextInt();
	
	String answer = solution(test_case);
	
	System.out.println(answer);
	}
		
}
