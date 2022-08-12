package 인프런;

import java.util.*;

public class 인프런_이분탐색 {
	
	public int findIndex(int[] num_arr, int target_number, int start_index, int end_index) {
		
		
		
		while(start_index < end_index) {
			int mid = (start_index + end_index) / 2;
			
			System.out.println(num_arr[mid]);
			if(num_arr[mid] == target_number) {
				return mid;
			}if(num_arr[mid] > target_number) {
				end_index = mid;
			}else {
				start_index = mid;
			}
		}
		
		
		
		return 0;
	}
	public static void main(String[] args) {
		
		인프런_이분탐색 T = new 인프런_이분탐색();
		Scanner scn = new Scanner(System.in);
		
		int num = scn.nextInt();
		int target_number = scn.nextInt();
		int[] num_arr = new int[num];
		
		for(int i=0; i< num; i++) {
			num_arr[i] = scn.nextInt();
		}
		int start_index = 0;
		int end_index = num - 1;
		Arrays.sort(num_arr);
		
		int answer = T.findIndex(num_arr, target_number, start_index, end_index);
		
		System.out.println(answer+1);
	}
}
