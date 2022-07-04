package 프로그래머스;

import java.util.*;

public class 인프런_회문_문자열 {

	public String solution(String s) {

	    String answer = "";
	    
	    s = s.toLowerCase();
	    int lt = 0;
	    int rt = s.length() -1;

	    char[] chr = s.toCharArray();
	    int cnt = 0;
	    
	    while (lt < rt) {
	      if(chr[lt] != chr[rt]) {
	        cnt ++;
	      }
	      else {
	        lt++;
	        rt--;
	      }
	      if(cnt > 0) {
	        break;
	      }
	    }
	    if(cnt == 0) {
	      answer = "YES";
	    }
	    else{
	      answer = "NO";
	    }
	    return answer;
	  }
}
