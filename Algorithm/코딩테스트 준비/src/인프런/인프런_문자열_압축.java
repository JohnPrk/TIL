package 인프런;

import java.util.*;

public class 인프런_문자열_압축 {
	
	public static String compress(String str) {
		
		String ans = "";
		String answer = "";
		char target_chr = ' ';
		
		char[] chr_arr = str.toCharArray();
		int cnt = 1;
		for(char c : chr_arr) {
			
			if(c == target_chr) {
				cnt++;
			}else {
				ans += target_chr;
				ans += cnt;
				target_chr = c;
				cnt = 1;
			}
		}
		ans += target_chr;
		ans += cnt;
		
		ans = ans.trim();
		char[] ans_arr = ans.toCharArray();
		for(char c2 : ans_arr) {
			if(c2 != '1') {
				answer += c2;
			}
		}
		
		
		
		return answer;
	}
	
	public static void main(String[] args) {
		
		
		Scanner scn = new Scanner(System.in);
		
		String str = scn.next();
		
		String answer = compress(str);
		
		System.out.println(answer);
	}
}
