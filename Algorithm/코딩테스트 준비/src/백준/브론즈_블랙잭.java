package 백준;

import java.util.*;

public class 브론즈_블랙잭 {
	
	
	public static int search21(String[] numbers, int max_num) {
		
		int answer = -1;
		
		for(int i = 0; i < numbers.length ; i++) {
			for(int j = i+1 ; j < numbers.length ; j++) {
				for(int k = j+1 ; k < numbers.length ; k++) {
					int max_numb = Integer.valueOf(numbers[i]) + Integer.valueOf(numbers[j]) + Integer.valueOf(numbers[k]);
					if(max_numb > answer && max_numb <= max_num) {
						answer = Integer.valueOf(numbers[i]) + Integer.valueOf(numbers[j]) + Integer.valueOf(numbers[k]);
					}
				}
			}
		}
		
		
		return answer;
		
	}
	
	public static int solution(String max_num, String[] numbers) {
		
		return search21(numbers,Integer.valueOf(max_num));
	}
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		String[] str_arr = scn.nextLine().split(" ");
		String[] numbers = scn.nextLine().split(" ");
		
		int answer = solution(str_arr[1], numbers);
		
		System.out.println(answer);
	}
}
