package 백준;

import java.util.*;

public class 브론즈_10430 {
	
	public static void one(int A, int B, int C) {
		System.out.println((A+B)%C);
	}
	public static void two(int A, int B, int C) {
		System.out.println(((A%C) + (B%C))%C);
	}
	public static void three(int A, int B, int C) {
		System.out.println((A*B)%C);
	}
	public static void four(int A, int B, int C) {
		System.out.println(((A%C) * (B%C))%C);			
	}
	
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		String str = scn.nextLine();
		String[] str_Arr = str.split(" ");
		int a = Integer.parseInt(str_Arr[0]);
		int b = Integer.parseInt(str_Arr[1]);
		int c = Integer.parseInt(str_Arr[2]);
		
		one(a,b,c);
		two(a,b,c);
		three(a,b,c);
		four(a,b,c);
	}
}
