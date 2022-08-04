package 인프런;

import java.util.*;

public class 인프런_최대_매출 {
	
	static int max;
	
	public void solution(int num1, int num2, int[] num_arr) {
		
		
		int sum =0;
		for(int i=0; i < num2; i++) {
			sum += num_arr[i];
		}
		max = sum;
		
		for(int j=num2; j < num1; j++) {
			sum = sum + num_arr[j] - num_arr[j-num2];
			if(max < sum) {
				max = sum;
			}
		}
	}
	
	public static void main(String[] args) {
		
		인프런_최대_매출 T = new 인프런_최대_매출();
		Scanner scn = new Scanner(System.in);
		max =Integer.MIN_VALUE;
		
		int num1 = scn.nextInt();
		int num2 = scn.nextInt();
		int[] num_arr = new int[num1];
		
		for(int i=0; i < num1; i++) {
			num_arr[i] = scn.nextInt();
		}
		
		T.solution(num1, num2, num_arr);
		
		System.out.println(max);
	}
}
