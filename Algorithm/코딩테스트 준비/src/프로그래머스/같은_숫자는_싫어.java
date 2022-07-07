package 프로그래머스;

import java.util.*;

public class 같은_숫자는_싫어 {
	
	public int[] solution(int []arr) {
        
        ArrayList<Integer> list = new ArrayList<>();
        
        int tmp = -1;
        
        for(int ar : arr) {
            if(tmp != ar) {
                list.add(ar);
                tmp = ar;
            }    
        }
        
        int cnt = 0;
        int[] answer = new int[list.size()];
        
        for(int lst : list) {
            answer[cnt] = lst;
            cnt++;
        }
        

        return answer;
    }
}
