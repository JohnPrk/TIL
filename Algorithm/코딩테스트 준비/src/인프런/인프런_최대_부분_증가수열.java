package 인프런;
import java.util.*;
public class 인프런_최대_부분_증가수열 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int max = Integer.MIN_VALUE;
		int num = scn.nextInt();
		int[] dp = new int[num+1];
		int[] numbers = new int[num+1];
		for(int i=1; i < numbers.length; i++) {
			numbers[i] = scn.nextInt();
		}
		dp[1] = 1;
		for(int i=2; i <= num; i++) {
			if(numbers[i] > numbers[i-1]) {
				dp[i] = dp[i-1] +1;
			}else {
				dp[i] = 1;
			}
		}
		for(int i=0; i < dp.length; i++) {
			max = Math.max(max, dp[i]);
		}
		System.out.println(max);
	}
}
