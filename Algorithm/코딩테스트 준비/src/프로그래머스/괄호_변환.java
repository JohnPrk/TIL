package 프로그래머스;

import java.util.*;

public class 괄호_변환 {
	
	int pos;
	
	public boolean isCorrect(String str) {
    		
		boolean answer = true;
    	
		Stack<Character> stack = new Stack<>();
		int left_cnt = 0, right_cnt=0;
		
		for(int i=0; i < str.length(); i++) {
        	if(str.charAt(i) == '(') {
        		left_cnt ++;
        		stack.push('(');
        	}else { 
        		right_cnt++;
        		if(stack.isEmpty()) {
        			answer =false;
        		}else {
        			stack.pop();
        		}
        	}
        	
        	if(left_cnt == right_cnt) {
        		pos = i+1;
        		return answer;
        	}
		}
        	
    	return true;
    }
	
	
	
	public String solution(String p) {
		
		if (p.isEmpty()) {
		return p;
		}
		
        boolean correct = isCorrect(p);
        

        
        String u = p.substring(0, pos);
        String v = p.substring(pos);
        
        if(correct) {
        	return u + solution(v);
        }
        
        
        String answer = "(" + solution(v) + ")";

        
        for(int i=1; i< u.length() -1 ; i++) {
        	if (u.charAt(i) == '(') {
        		answer += ")";
        	}else {
        		answer += "(";
        	}
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		
		괄호_변환 T = new 괄호_변환();
		
		String p = ")(";
		
		String answer = T.solution(p);
		
		
	}
}
