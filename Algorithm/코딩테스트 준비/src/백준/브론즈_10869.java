package 백준;

import java.util.*;

public class 브론즈_10869 {
	
	public static int plus (int f, int s) {
		return f + s; 
	}
	public static int minus (int f2, int s2) {
		return f2- s2;
	}
	public static int times (int f3, int s3) {
		return f3 * s3;
	}
	public static int divide (int f4, int s4) {
		return f4 / s4;
	}
	public static int share (int f5, int s5) {
		return f5 % s5;
	}
	
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int first_number = scn.nextInt();
		int second_number = scn.nextInt();
		
		int p = plus(first_number, second_number);
		int m = minus(first_number, second_number);
		int t = times(first_number, second_number);
		int d = divide(first_number, second_number);
		int s = share(first_number, second_number);
		
		System.out.println(p);
		System.out.println(m);
		System.out.println(t);
		System.out.println(d);
		System.out.println(s);
		
	}
}
