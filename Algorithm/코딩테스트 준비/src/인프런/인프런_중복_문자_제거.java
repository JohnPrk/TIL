package 인프런;

import java.util.*;


public class 인프런_중복_문자_제거 {

	public String solution(String s) {

	    char[] chr = s.toCharArray();
	    
	    String answer = "";
	    
	    for(char c: chr) {
	      if(!answer.contains(String.valueOf(c))) {
	        answer += c;  
	      }
	    }
	    
	    return answer;
	  }
}
