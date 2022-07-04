package 백준;

import java.util.*;

public class 브론즈_2588 {
	
	public static void times (int A, int B) {
		
		int b = B;
		
		while(b > 0) {
			int i = b % 10;
			System.out.println(A * i);
			b /= 10;

		}
		
		System.out.println(A*B);
	}
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int first_number = scn.nextInt();
		int second_number = scn.nextInt();
		
		
		times(first_number, second_number);
	}
}
