package 인프런;

import java.util.*;

public class 인프런_돌다리_건너기 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		int[] dp = new int[36];
		dp[1] = 1;
		dp[2] = 2;
		for(int i=3; i <= num; i++) {
			dp[i] = dp[i-1] + dp[i-2];
		}
		System.out.println(dp[num] + dp[num-1]);
	}
}
