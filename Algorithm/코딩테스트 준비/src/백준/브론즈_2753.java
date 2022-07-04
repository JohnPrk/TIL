package 백준;

import java.util.*;


public class 브론즈_2753 {
	
	public static String findtwentynine(int A) {
		

		
		if(A % 4 == 0 && (A % 100 != 0 || A % 400 == 0)) {
			return "1";
		}else {
			return "0";
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int year = scn.nextInt();
		
		String answer = findtwentynine(year);
	
		System.out.println(answer);
	}
}
