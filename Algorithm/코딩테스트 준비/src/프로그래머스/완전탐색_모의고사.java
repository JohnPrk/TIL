package 프로그래머스;

import java.util.*;

public class 완전탐색_모의고사 {

	public int[] solution(int[] answers) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        int[] one = {1, 2, 3, 4, 5};
        int[] two = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] three = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int one_cnt = 0;
        int two_cnt = 0; 
        int three_cnt = 0; 
        
        for(int i = 0; i < answers.length ; i++) {
            if(answers[i] == one[i%one.length]) {
                one_cnt++;
            }if(answers[i] == two[i%two.length]) {
                two_cnt++;
            }if(answers[i] == three[i%three.length]) {
                three_cnt++;
            }
        }
        
        int max = Math.max(Math.max(one_cnt, two_cnt), three_cnt);
        
        if(max == one_cnt) {
            list.add(1);    
        }if(max == two_cnt) {
            list.add(2);
        }if(max == three_cnt) {
            list.add(3);
        }
        
        
        int[] answer = new int[list.size()];
        
        for(int j = 0; j < list.size(); j++) {
            answer[j] = list.get(j);
        }
        
        
        return answer;
    }
}
