package 인프런;

import java.util.*;

public class 인프런_암호 {
	
	public static String deCode(String[] str_arr) {
		String answer = "";
		
		for(String s : str_arr) {
			int num = Integer.parseInt(s, 2);
			
			char c = (char) num;
			
			answer += c;
		
		}
		
		return answer;
	}
	
	public static String[] split(String str) {
		
		
		String[] str_arr = new String[(int) (str.length() / 7)];
		
		int cnt = (int) (str.length() / 7);
		
		int s = 0;
		for(int i = 0; i < cnt ; i++) {
			str_arr[i] = str.substring(s, s + 7);
			s += 7;
		}	
				
		return str_arr;
	}
	
	
	public static String decimal(String str) {
		
		String answer = "";
		
		String[] str_arr = str.split("");
		
		for(String s : str_arr) {
			if(s.equals("#")) {
				answer += "1";
			}else if(s.equals("*")) {
				answer += "0";
			}
		}
		return answer;
	}
	
	
	public static String solution(String str) {
		
		String answer = "";
		
		String long_code = decimal(str);
		
		String[] short_codes = split(long_code);
		
		answer = deCode(short_codes);
				
		return answer;
	}
	
	public static void main(String[] args) {
		
		
		Scanner scn = new Scanner(System.in);
		
		int num = scn.nextInt();
		String secret_code = scn.next();
		
		String answer = solution(secret_code);
		
		System.out.println(answer);
	}
}
