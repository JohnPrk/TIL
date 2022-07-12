package 프로그래머스;

import java.util.*;

public class 정렬_가장_큰_수 {

	public String solution(int[] numbers) {
        String answer = "";
        
        String[] str_arr = new String[numbers.length];
        
        for(int i=0; i < numbers.length; i++) {
            str_arr[i] = numbers[i] + "";
        }
        String tmp= "";
        
        Arrays.sort(str_arr, Collections.reverseOrder());
        
        for(String s : str_arr) {
            if(!s.contains("0")) {
                answer+= s;    
            }else {
                tmp += s;        
            }
            
        }
        answer += tmp;
        
        return answer;
    }
	
	public static void main(String[] args) {
		
		정렬_가장_큰_수 T = new 정렬_가장_큰_수();
		
		int[] numbers = new int[] {978, 97};
		
		String answer = T.solution(numbers);
		
		System.out.println(answer);
	}
}
