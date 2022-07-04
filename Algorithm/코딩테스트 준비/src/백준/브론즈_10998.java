package 백준;

import java.util.*;

public class 브론즈_10998 {
	
	public static int plus (int f, int s) {
		return f + s; 
	}
	public static int minus (int f2, int s2) {
		return f2- s2;
	}
	public static int times (int f3, int s3) {
		return f3 * s3;
	}
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int first_number = scn.nextInt();
		int second_number = scn.nextInt();
		
		float answer = times(first_number, second_number);
		
		System.out.println(answer);
		
	}
}
