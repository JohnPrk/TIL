package 백준;

import java.util.*;
public class 시뮬레이션_실버_1515 {
	
	
	public static void main(String[] args) throws NumberFormatException {
		
		Scanner scn = new Scanner(System.in);
		
		int cnt = 1;
		int numbers_cnt = 0;
		String[] numbers = scn.next().split("");
		
		while(numbers_cnt < numbers.length) {
			
			String[] cntToString = Integer.toString(cnt).split("");
			int cnt_cnt = cntToString.length;
			int nums = Integer.parseInt(numbers[numbers_cnt]);
			
			for(int i=0; i < cnt_cnt; i++) {
				if(nums == Integer.parseInt(cntToString[i])) {
					numbers_cnt ++;	
				}
			}
			cnt ++;
		}
		System.out.println(cnt-1);
	}
}
