package codingTest_programmers_pac;

import java.util.HashSet;
import java.util.HashMap;
import java.util.ArrayList;


class 카카오_채용연계형_인턴십_숫자_문자열_영단어 {     
	public int solution(String s) {

			  String[]  num= {"0","1","2","3","4","5","6","7","8","9"};
			    String[] word= {"zero" , "one" , "two" , "three" , "four" , "five" , "six" , "seven" , "eight" , "nine"};
			        for (int i = 0 ; i <10 ; i++){
			            s = s.replace(word[i] , num[i]);
			        }
			        return Integer.parseInt(s);
			    }
}