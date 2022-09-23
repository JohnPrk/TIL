package 인프런;

import java.util.*;

public class 인프런_수열_추측하기 {
	public static int combi(int depth, int num) {
		if(depth == num && num == 0) return 1;
		return combi(depth-1, num-1) + combi(depth-1, num);
	}
	public static void combination(int depth, int num, int[] combination) {
		if(depth == num -1) return;
		combination[depth] = combi(depth, num);
		combination(depth++, num, combination);
		
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		int target_num = scn.nextInt();
		int[] combination = new int[num];
		combination(0, num, combination);
		for(int c : combination) {
			System.out.println(c);
		}
		
		
		
	}
}
