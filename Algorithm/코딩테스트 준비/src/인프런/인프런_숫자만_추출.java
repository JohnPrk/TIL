package 인프런;

import java.util.*;

public class 인프런_숫자만_추출 {
	
	public static int printNumber(String str) {
		
		String s = "";
		
		char[] chr_arr = str.toCharArray();
		
		for(char c : chr_arr) {
			if(Character.isDigit(c)) {
				s += c;
			}
		}
		
		int answer = Integer.parseInt(s);
		
		
		
		return answer;
	}
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		String str = scn.nextLine();
		
		int answer = printNumber(str);
		
		System.out.println(answer);
	}
}
