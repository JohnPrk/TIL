package 프로그래머스;

import java.util.*;


public class 자릿수_더하기 {
	
   public int solution(int n) {
	        
       int answer = 0;
       String str = n +"";
	        
       char[] chr_list = str.toCharArray();
	        
       for(char c : chr_list){
          answer += Character.getNumericValue(c);
          
       }

	   return answer;
   }
}