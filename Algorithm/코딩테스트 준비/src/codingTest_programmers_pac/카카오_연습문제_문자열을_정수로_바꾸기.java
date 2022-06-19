package codingTest_programmers_pac;

public class 카카오_연습문제_문자열을_정수로_바꾸기 {
	public int solution(String s) {
        int answer = 0;
		String str = "";
		
		if (s.startsWith("-")) {
			for(int i = 1; i<s.length(); i++) {
				str += s.charAt(i); 
			}
			answer = -1 * Integer.parseInt(str);
		}else if(s.startsWith("+")){
			for(int i = 1; i<s.length(); i++) {
				str += s.charAt(i); 
			}
			answer = Integer.parseInt(str);
			
		}else {
			for(int i = 0; i<s.length(); i++) {
				str += s.charAt(i); 
			}
			answer = Integer.parseInt(str);
		}
        
		
		
        return answer;
    }
}
