package 백준;

import java.util.*;

public class 브론즈_반복문_10950 {

	public static void plus(int A, int B) {
		System.out.println(A + B);
	}
	
	
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int cnt = scn.nextInt();
		
		for(int i=0; i < cnt; i++) {
			int A = scn.nextInt();
			int B = scn.nextInt();
			
			plus(A, B);
		}
	}
}
