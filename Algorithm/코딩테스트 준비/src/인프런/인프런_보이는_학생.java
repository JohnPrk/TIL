package 인프런;

import java.util.*;

public class 인프런_보이는_학생 {

	public static int findStudentsByHeight(int[] num_arr) {
		int answer = 0;
		int max_height = -1;
		
		
		
		for(int n : num_arr) {
			if(n > max_height) {
				answer++;
				max_height = n;
			}
		}
		
		return answer;
	}
	
	public static int[] stringToInt(String[] str_arr) {
		
		int[] answer = new int[str_arr.length];
		
		int cnt = 0;
		
		for(String s : str_arr) {
			answer[cnt] = Integer.parseInt(s);
			cnt++;
		}
		
		return answer;
	}
	public static int solution(String[] str_arr) {
		
		
		int[] num_arr = stringToInt(str_arr);
		int answer = findStudentsByHeight(num_arr);
		
		return answer;
	}
	
	public static void main(String[] args) {
			
		Scanner scn= new Scanner(System.in);
			
		int num = scn.nextInt();
		scn.nextLine();
			
		String[] str_arr = scn.nextLine().split(" ");
		
		int answer = solution(str_arr);
		
		System.out.println(answer);

	}
}
