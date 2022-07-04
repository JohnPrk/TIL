package 프로그래머스;

import java.util.*;

public class 완주하지_못한_선수_sort {
	
	// sort 풀이
	public String solution(String[] participant, String[] completion) { 
        
        Arrays.sort(participant);
        Arrays.sort(completion);
        
        int i =0;
        for(; i < completion.length ; i++) {
            if(!completion[i].equals(participant[i])) {
                break;
            }
            
        }
        return participant[i];
        
        
    }
}
