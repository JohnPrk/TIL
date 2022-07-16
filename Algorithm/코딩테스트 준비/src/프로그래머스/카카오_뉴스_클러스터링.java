package 프로그래머스;

import java.util.*;

public class 카카오_뉴스_클러스터링 {
	 public int solution(String str1, String str2) {
	        
	        int answer = 0;
	        double ans = 0;
	        int hap = 0;
	        int gyo = 0;
	        
	        str1 = str1.toLowerCase();
	        str2 = str2.toLowerCase();
	        
	        ArrayList<String> str1_list = new ArrayList<String>();
	        ArrayList<String> str2_list = new ArrayList<String>();
	        ArrayList<String> intersection = new ArrayList<String>();
	        ArrayList<String> union = new ArrayList<String>();
	        
	        
	        
	        char[] ch1_arr = str1.toCharArray();
	        char[] ch2_arr = str2.toCharArray();
	        
	        
	        
	        for(int i =1; i < ch1_arr.length; i++) {
	            if(Character.isAlphabetic(ch1_arr[i-1]) && Character.isAlphabetic(ch1_arr[i])) {
	                str1_list.add(String.valueOf(ch1_arr[i-1]) + String.valueOf(ch1_arr[i]));
	            }
	        }
	        for(int j =1; j < ch2_arr.length; j++) {
	            if(Character.isAlphabetic(ch2_arr[j-1]) && Character.isAlphabetic(ch2_arr[j])) {
	                str2_list.add(String.valueOf(ch2_arr[j-1]) + String.valueOf(ch2_arr[j]));    
	            }
	        }
	        
	       
	        Collections.sort(str1_list);
	        Collections.sort(str2_list);
	        
	       
	        
	        for(String s1 : str1_list) {
	            if(str2_list.remove(s1)) {
	                intersection.add(s1);    
	            }
	            union.add(s1);    
	        }
	        
	        
	        for(String s2: str2_list) {
	            union.add(s2);
	        }
	        
	        double jakard = 0;

	        if(union.size() == 0) {
	            jakard = 1;
	        }else {
	            jakard = (double) intersection.size() / (double) union.size();
	        }
	        
	        answer = (int) (65536 * jakard);
	        
	        return answer;
	    }
}
