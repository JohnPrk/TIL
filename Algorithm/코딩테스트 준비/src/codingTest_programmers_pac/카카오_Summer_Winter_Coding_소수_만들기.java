package codingTest_programmers_pac;

import java.util.ArrayList;
import java.util.Arrays;

public class 카카오_Summer_Winter_Coding_소수_만들기 {
	
	public int solution(int[] nums) {
        
		int answer = 0;
        
        ArrayList<Integer> numsArr = new ArrayList<Integer>();
        ArrayList<Integer> sosuArr = new ArrayList<Integer>();
        
       Arrays.sort(nums);
       
        
        for(int i = 0 ; i < nums.length -2 ; i++) {
        	for(int j = 1 ; j < nums.length -1 ; j++) {
        		for(int k = 2 ; k < nums.length ; k++) {
        			if(i < j && j < k) {
        				numsArr.add(nums[i] + nums[j] + nums[k]);
        				}
        			}
        		}
        	}
        
        for(int i =1; i<= numsArr.get(numsArr.size()-1) ; i++) {
        	sosuArr.add(i);
        }
        
        
        
        
        for(int i = 2; i <= numsArr.get(numsArr.size()-1) ; i++) { // 2,3,4,5,6,7,8,9
        	for(int j = 2; j < i ; j++) {
        		if(i % j == 0) {
        			sosuArr.remove(Integer.valueOf(i));
        		}
        	}
        }
        
        for(int i : sosuArr) {
        	for(int j : numsArr) {
        		if(i ==j) {
        			answer += 1;
        		}
        	}
        }
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        
        
        return answer;
    }
}
