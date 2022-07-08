package 프로그래머스;

import java.util.*;

public class 최대_공약수와_최소_공배수 {
	
	public static int gcd(int n, int m) {
        
		
		int max_number = Math.max(n, m);
		int min_number = Math.min(n, m);
		
		if(min_number == 0) {
			return max_number;
		}else {
			return gcd(min_number, max_number % min_number);
		}
		
    }
    public static int lcm(int n, int m) {
        
    	int answer = (n * m) / gcd(n, m);
    	
    	return answer;
        
    }
    
    
    public static int[] solution(int n, int m) {
    	
    	int[] answer = new int[2];
    	
    	answer[0] = gcd(n, m);
    	answer[1] = lcm(n, m);
    	
    	
    	return answer;
    }
    
    
    public static void main(String[] args) {
    	
    	solution(3, 12);
    }
}
