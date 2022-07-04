package 백준;

import java.util.*;


public class 브론즈_9498 {
	
	public static String check(int A) {
		
		if(A >= 90 && A <= 100) {
			return "A";
		}else if(A >= 80 && A <= 89) {
			return "B";
		}else if(A >= 70 && A <= 79) {
			return "C";
		}else if(A >= 60 && A <=69) {
			return "D";
		}else {
			return "F";
		}
	}
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int i = scn.nextInt();
		
		String answer = check(i);
		
		System.out.println(answer);
	}
}
