package 프로그래머스;

import java.util.*;

public class 인프런_특정_문자_뒤집기 {
	
	
	public String solution(String s) {
	    char[] chr = s.toCharArray();
	    char[] answer = new char[chr.length];
	    
	    int lt_cnt = 0;
	    int rt_cnt = chr.length-1;

	    while(lt_cnt < rt_cnt) {
	      if(!Character.isAlphabetic(chr[lt_cnt])) {
	        lt_cnt ++;
	      }
	      else if(!Character.isAlphabetic(chr[rt_cnt])) {
	        rt_cnt--;
	      }
	      else{
	        char tmp = chr[lt_cnt];
	        chr[lt_cnt] = chr[rt_cnt];
	        chr[rt_cnt] = tmp;
	        lt_cnt++;
	        rt_cnt--;
	      }
	      
	    }
	      
	    return new String(chr);
	  }
	  
	  
	 
}
