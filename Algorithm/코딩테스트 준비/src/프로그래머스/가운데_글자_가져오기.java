package 프로그래머스;

import java.util.*;

public class 가운데_글자_가져오기 {
	public String solution(String s) {
        String answer = "";
        
        char[] chr_list = s.toCharArray();
        
        if(chr_list.length % 2 != 0) {
            answer += chr_list[(chr_list.length / 2)];
        }else{
            answer += chr_list[(chr_list.length / 2) -1];
            answer += chr_list[(chr_list.length / 2)];
        }
        
        
        return answer;
    }
}
