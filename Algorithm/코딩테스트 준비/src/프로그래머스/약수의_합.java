package 프로그래머스;

import java.util.*;

public class 약수의_합 {
	
	public int solution(int n) {
       
        int answer = 0;
        
        for (int i = 1; i <= n ; i ++) {
            if(n % i == 0){
                answer += i;        
            }
        }
        
        
        return answer;
    }
}
