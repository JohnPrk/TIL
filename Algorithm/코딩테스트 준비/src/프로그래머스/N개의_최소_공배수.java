package 프로그래머스;

import java.util.*;

public class N개의_최소_공배수 {
	public static int gcd(int n, int m) {
		
		int answer = 0;
		
		int max_number = Math.max(n, m);
		int min_number = Math.min(n, m);
		
		if(min_number == 0) {
			return max_number; 
		}else {
			return gcd(min_number, max_number % min_number);
		}
	}
	
	
	public static int lcm(int[] arr) {
		 
		 Arrays.sort(arr);
		 
		 int[] real_arr = arr.clone();
		 
		 for(int i = 1; i < arr.length ; i++) {
			 
			 
			 arr[i] = (arr[i-1] * arr[i]) / gcd(arr[i-1], arr[i]);
		 }
		 
		 int answer = arr[arr.length -1];
		 
		 return answer;
	 }
	    
	 public static int solution(int[] arr) {
	       
	        
	        int answer = lcm(arr);
	        
	        return answer;
	    }
	 
	 public static void main(String[] args) {
		 
		 int answer = solution(new int[] {1,2,3});
		 
		 System.out.println(answer);
	 }
}
