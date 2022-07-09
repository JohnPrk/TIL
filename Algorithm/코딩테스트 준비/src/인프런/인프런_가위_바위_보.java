package 인프런;

import java.util.*;

public class 인프런_가위_바위_보 {

	
	public static String[] compare(int num, int[] int_arr1, int[] int_arr2) {
		String[] answer = new String[num];
		
		int cnt = 0;
		
		for(int i = 0; i < num; i++) {
			
			
			if(int_arr1[i] == int_arr2[i]) {
				answer[cnt] = "D";
			}else if(int_arr1[i] == 1 && int_arr2[i] == 2) {
				answer[cnt] = "B";
			}else if(int_arr1[i] == 2 && int_arr2[i] == 3) {
				answer[cnt] = "B";
			}else if(int_arr1[i] == 1 && int_arr2[i] == 3) {
				answer[cnt] = "A";
			}else if(int_arr1[i] == 2 && int_arr2[i] == 1) {
				answer[cnt] = "A";
			}else if(int_arr1[i] == 3 && int_arr2[i] == 2) {
				answer[cnt] = "A";
			}else if(int_arr1[i] == 3 && int_arr2[i] == 1) {
				answer[cnt] = "B";
			}
			cnt++;
			
		}
		
		return answer;
	}
	
	public static void solution(int num, int[] int_arr1, int[] int_arr2) {
		
		String[] answer_list = compare(num, int_arr1, int_arr2);
		
		for(String answer : answer_list) {
			
			System.out.println(answer);
		}
		
	}
		
	public static void main(String[] args ) {
		
		Scanner scn = new Scanner(System.in);
		
		int num = scn.nextInt();
		scn.nextLine();
		
		int[] int_arr1 = Arrays.stream(scn.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int[] int_arr2 = Arrays.stream(scn.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		
		
		solution(num, int_arr1, int_arr2);
	}
	
}
