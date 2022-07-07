package 인프런;

import java.util.*;

public class 인프런_문자_속_단어 {

	public String solution(String str) {

	    String[] str_array = str.split(" ");
	    int max = 0;
	    int cnt = 0;
	    // System.out.println(str_array.length);
	    for (int i =0; i < str_array.length ; i++ ) {
	      if(max < str_array[i].length()) {
	        max = str_array[i].length();
	        cnt = i;
	      }  
	    }
	    
	    return str_array[cnt];
	  }
	  
// 	  메인	  
//	  public static void main(String[] args) {
//
//	    Main m = new Main();
//
//	    Scanner scn = new Scanner(System.in);
//
//	    String str = scn.nextLine();
//	    
//	    String s = m.solution(str);
//
//	    System.out.println(s);
//	  }
}
