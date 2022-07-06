package 프로그래머스;

import java.util.*;

public class KAKAO_BLIND_RECRUITMENT_1차_비밀지도 {

	
	public static String plus(ArrayList<Integer> lst1, ArrayList<Integer> lst2) {
		ArrayList<String> answer_arr = new ArrayList<>();
		String answer = "";
		
		
		for(int i = 0; i < lst1.size(); i++) {
			answer_arr.add(Integer.toString(lst1.get(i) + lst2.get(i)));
			
			if(answer_arr.get(i).equals("2")) {
				answer_arr.set(i, "#"); 
			}else if(answer_arr.get(i).equals("1")) {
				answer_arr.set(i, "#");
			}else {
				answer_arr.set(i, " ");
			}
		}
		for(String ans : answer_arr) {
			answer += ans;
		}
		
		return answer;
	}
	public static ArrayList<Integer> notation(int i, int n) {
       
		ArrayList<Integer> list = new ArrayList<>();
		
		int wh_i = i;
		while(wh_i > 0) {
			list.add(wh_i % 2);
			wh_i /= 2;
		}
        while(list.size() != n) {
            list.add(0);            
        }
		
        
		Collections.reverse(list);

		return list;
    }
    
    public static String[] xor(int n, int[] arr1, int[] arr2) {
        
        String[] answer = new String[n];
        
        int cnt = -1;
        // System.out.println(notation(arr1[0]));  
        for(int i =0; i < arr1.length ; i++) {
        	
        	ArrayList<Integer> lst1 = notation(arr1[i], n);
        	ArrayList<Integer> lst2 = notation(arr2[i], n);
            
        	cnt++;
            // System.out.println(lst1.size());
        	
            answer[cnt] = plus(lst1, lst2);
        }
        
        
        return answer;
    }
    
    public String[] solution(int n, int[] arr1, int[] arr2) {
        
        String[] answer = xor(n, arr1, arr2);
        
        return answer;
    }
}
