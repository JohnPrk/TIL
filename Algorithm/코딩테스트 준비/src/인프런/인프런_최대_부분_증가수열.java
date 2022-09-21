// 8 
// 5 3 7 8 6 2 9 4

package 인프런;
import java.util.*;
public class 인프런_최대_부분_증가수열 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int num = scn.nextInt();
		int[] int_array = new int[num];
		int[] dp = new int[num];
		for(int i =0; i < num; i++) int_array[i] = scn.nextInt();
		dp[0] = 1;
		for(int i =1; i < dp.length; i++) {
//			System.out.println(int_array[i]);
			if(int_array[i] <= int_array[i-1]) {
//				
			}
			else {
				
			}
		}
//		System.out.println(dp.toString());
		
	}
}
