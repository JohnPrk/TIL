package 프로그래머스;

import java.util.*;

public class 완주하지_못한_선수_keySet {
	
	public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        HashMap<String, Integer> map = new HashMap<>();
        
        for(String p : participant){
            map.put(p, map.getOrDefault(p, 0) +1);
        }
        
        for(String c : completion) {
            map.put(c, map.get(c)-1);
        }
        
        
        for(String key : map.keySet()) {
            if(map.get(key) != 0) {
                answer = key;
                break;
            }   
        }
        
        
        return answer;
    } 
}
