package codingTest_programmers_pac;

public class 카카오_월간_코드_챌린지_시즌2_약수의_개수와_덧셈 {
	
	class Solution {
	    public int solution(int left, int right) {
	        
	        
	        int answer = 0;
	        
	        for(int i = left ; i <= right ; i ++) {
	            int cnt = 0;
	            for(int j = 1; j <= i ; j++) {
	                if(i % j == 0) {
	                    cnt += 1;
	                }
	            }
	            if(cnt % 2 == 0) {
	                answer += i;
	            }else {
	                answer -= i;
	            }
	        }
	        
	        return answer;
	    }
	}
}
