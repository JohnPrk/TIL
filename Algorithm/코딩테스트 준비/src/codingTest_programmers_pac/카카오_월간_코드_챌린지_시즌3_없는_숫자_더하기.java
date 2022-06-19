package codingTest_programmers_pac;

import java.util.ArrayList;

public class 카카오_월간_코드_챌린지_시즌3_없는_숫자_더하기 {
	
	
	public int solution(int[] numbers) {
       
		
        ArrayList<Integer> allNumbers = new ArrayList<Integer>();
		allNumbers.add(1);
		allNumbers.add(2);
		allNumbers.add(3);
		allNumbers.add(4);
		allNumbers.add(5);
		allNumbers.add(6);
		allNumbers.add(7);
		allNumbers.add(8);
		allNumbers.add(9);
		allNumbers.add(0);
		
		int answer = 0;
		
		for(int num : numbers) {
			
			if(allNumbers.contains(num)) {
				allNumbers.remove(Integer.valueOf(num));
			};
		}
		for(int num : allNumbers) {
			answer += num;
		}
		
	
        return answer;
    }
}
