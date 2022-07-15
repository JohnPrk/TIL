package 프로그래머스;

import java.util.*;

public class 조이스틱 {

public int solution(String name) {
        
	String[] alphabet = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U","V", "W", "X", "Y", "Z"};
    
    
    int answer = 0;
    int tmp = 0;
    int tmp_idx = 0;
    
    
    int dis;
    int forw;
    int backw;
    int distance = Integer.MAX_VALUE;
        
    String[] str_arr = name.split("");
    
    
    for(int i=0; i < str_arr.length; i++) {
        
        for(int idx=0; idx < alphabet.length; idx++) {
            
            if(str_arr[i].equals(alphabet[idx])){
                
                
            
                dis = Math.abs(tmp_idx - idx);
                forw = idx+1;
                backw = 25 - idx + 1;
                
                

                
                distance = Math.min(distance, dis);
                
                distance = Math.min(distance,forw);
                
                distance = Math.min(distance,backw);   
                
                System.out.println(distance);
                
                
                answer += distance;        
                tmp_idx = idx;
                distance = Integer.MAX_VALUE;
            }
            
        }
    }
        
    return answer;
}

	public static void main(String[] args) {
	
		
		조이스틱 T = new 조이스틱();
		
		T.solution("AAB");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
