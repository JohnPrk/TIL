package 프로그래머스;

import java.util.*;

public class KAKAO_BLIND_RECRUITMENT_1차_비밀지도 {

	
	public static ArrayList<Integer> plus(ArrayList<Integer> lst1, ArrayList<Integer> lst2) {
		ArrayList<Integer> answer = new ArrayList<>();
		
		System.out.println(lst2.toString());
		
		for(int i = 0; i < lst1.size(); i++) {
			answer.add(lst1.get(i) + lst2.get(i));
		}
		
//		System.out.println(answer.toString());
		
		return answer;
	}
	public static ArrayList<Integer> notation(int i) {
       
		ArrayList<Integer> list = new ArrayList<>();
		
		if(i < 2) {
			list.add(0);
			list.add(0);
			list.add(0);
			list.add(0);
		}else if(i < 4) {
			list.add(0);
			list.add(0);
			list.add(0);
		}else if(i < 8) {
			list.add(0);
			list.add(0);
		}else if(i < 16) {
			list.add(0);
		}
		
		while(i > 0) {
    	   list.add(i % 2);
    	   i /= 2;
		}
			

		return list;
    }
    
    public static String[] xor(int n, int[] arr1, int[] arr2) {
        
        String[] answer = new String[5];
        
        for(int i =0; i < arr1.length ; i++) {
        	ArrayList<Integer> lst1 = notation(arr1[i]);
        	ArrayList<Integer> lst2 = notation(arr2[i]);
            
        	plus(lst1, lst2);
        }
        
        
        
        return answer;
    }
    
    public String[] solution(int n, int[] arr1, int[] arr2) {
        
    	
        
        String[] answer = xor(n, arr1, arr2);
        
        return answer;
    }
    
    public static void main(String[] args) {
    	
    	KAKAO_BLIND_RECRUITMENT_1차_비밀지도 m = new KAKAO_BLIND_RECRUITMENT_1차_비밀지도();
    	
    	int n = 5;
        int[] arr1 = new int[] {9, 20, 28, 18, 11};
        int[] arr2 = new int[] {30, 1, 21, 17, 28};
        
    	m.solution(n, arr1, arr2);
    
        
    }
}
