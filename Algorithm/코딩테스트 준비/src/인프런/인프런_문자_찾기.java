package 인프런;

import java.util.*;

public class 인프런_문자_찾기 {
	
	public int Solution(String s1, String s2) {
	
		s1 = s1.toLowerCase();
	    s2 = s2.toLowerCase();

	    char[] c1 = s1.toCharArray();
	    char c2 = s2.charAt(0);
	  

	  int answer = 0;
	    for(char c: c1) {
	    	if(c == c2) {
	        answer ++;
	        }
	    }
	    return answer;
	  }
}
