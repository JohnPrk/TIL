package 프로그래머스;

import java.util.*;
public class 주식_가격 {
	public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        
        int full_cnt = 0;
        
        for(int i = 0; i < prices.length; i++) {
            int cnt = 0;
            int j = i + 1;
            
            for(; j < prices.length; j++) {
                if(prices[i] <= prices[j]){
                    cnt++;    
                }else {
                    cnt++;
                    break;
                }
            }
            
            answer[full_cnt] = cnt;
            full_cnt++;
        }
        
        
        
        return answer;
    }
}
