package 프로그래머스;

import java.util.*;

public class 인프런_대소문자_변환 {

	public String Solution(String i) {

	    String str = "";
	    char[] c1 = i.toCharArray();
	    ArrayList<Character> list = new ArrayList<>();
	      
	    for(char c : c1) {
	      if(c >= 'a' && c <= 'z') {
	        list.add((char) (c - 32));
	      }
	      else{
	        list.add((char) (c + 32));
	      }
	    }
	    for(char chr : list) {
	      str += chr;
	    }

	    
	    return str;  
	  }
}
