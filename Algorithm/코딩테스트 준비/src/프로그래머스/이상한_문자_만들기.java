package 프로그래머스;

import java.util.*;

public class 이상한_문자_만들기 {

	
	public static String upperCase(String s) {
		
		String answer = "";
		
		
		String[] str_arr = s.split("");
		int cnt = 0;
		
		for(int i = 0; i < str_arr.length ; i++) {
			
			if(str_arr[i].equals(" ")) {
				cnt =0;
			}else if (cnt % 2 ==0) {
				str_arr[i] = str_arr[i].toUpperCase();
				cnt++;
			
			}else if(cnt % 2 !=0){
				str_arr[i]= str_arr[i].toLowerCase();
				cnt++;
			}
			
			answer += str_arr[i];
			
			
		}
		
		
		return answer;
	}
	
	public static String solution(String s) {
		
		 String answer = upperCase(s);
		
		return answer;
	}
	
	
	public static void main(String[] args) {
		
		
		String answer = solution("try hello world");
	
		System.out.println(answer);
	}
	
}
