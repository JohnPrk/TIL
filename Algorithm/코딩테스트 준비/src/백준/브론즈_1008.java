package 백준;

import java.util.*;

public class 브론즈_1008 {
	
	public static int plus (int f, int s) {
		return f + s; 
	}
	public static int minus (int f2, int s2) {
		return f2- s2;
	}
	public static int times (int f3, int s3) {
		return f3 * s3;
	}
	public static double divide (int f4, int s4) {
		return  (double) f4 / s4;
	}
	
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int first_number = scn.nextInt();
		int second_number = scn.nextInt();
		
		double answer = divide(first_number, second_number);
		
		System.out.println(answer);
		
	}
}
