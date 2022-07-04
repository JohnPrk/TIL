package 백준;

import java.util.*;

public class 브론즈_1001 {
	
	public static int plus (int f, int s) {
		return f + s; 
	}
	public static int minus (int f2, int s2) {
		return f2- s2;
	}
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int first_number = scn.nextInt();
		int second_number = scn.nextInt();
		
		int answer = minus(first_number, second_number);
		
		System.out.println(answer);
		
	}
}
