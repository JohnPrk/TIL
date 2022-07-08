package 프로그래머스;

import java.util.*;

public class 문자열_내_p와_y의_개수 {

	public static boolean findChars(String str) {
		
		boolean answer = true;
		
		str = str.toLowerCase();
		String[] str_arr = str.split("");
		
		int p_cnt = 0;
		int y_cnt = 0;
		
		for(String s : str_arr) {
			if(s.equals("p")) {
				p_cnt++;
			}else if(s.equals("y")) {
				y_cnt++;
			}
		}
		if(p_cnt != y_cnt) {
			answer = false;
		}
		return answer;
	}
	
	public static boolean solution(String str) {
		
		boolean answer = findChars(str);	
		
		return answer;
	}
	
	public static void main(String[] args) {
		
		boolean answer = solution("pPoooyY");
		
		System.out.println(answer);
	}
}
