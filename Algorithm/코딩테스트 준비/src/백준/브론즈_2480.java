package 백준;

import java.util.*;


public class 브론즈_2480 {
	
	public static int reward(int A, int B, int C) {
		
		if(A == B  && A == C) {
			return 10000 + 1000 * A;
		}else if(A == B && A != C) {
			return 1000 + 100 * A;
		}else if(A != B && A == C) {
			return 1000 + 100 * A;
		}else if(B == C && A != C) {
			return 1000 + 100 * B;
		}else {
			int max = Math.max(Math.max(A,  B), C);
			return max * 100; 
		}
	}
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		String[] str_arr = scn.nextLine().split(" ");
		
		int answer = reward(Integer.parseInt(str_arr[0]), Integer.parseInt(str_arr[1]), Integer.parseInt(str_arr[2]));
	
		System.out.println(answer);
	}
}
