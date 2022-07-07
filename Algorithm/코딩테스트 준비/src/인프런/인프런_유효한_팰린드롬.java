package 인프런;

import java.util.*;

public class 인프런_유효한_팰린드롬 {
	
	public static String palindrome(String str) {
	  		
		String answer = "YES";
		str = str.toLowerCase();
		char[] chr_list = str.toCharArray();  
		  
		ArrayList<Character> list = new ArrayList<>();
		  
		for(char c : chr_list){
		  if(Character.isAlphabetic(c)) {
		   	list.add(c);
		  }
		}
		  
		int start_number = 0;
		int end_number = list.size() -1;
		  
		int cnt = 0;
		  
		while(start_number < end_number) {
			if(list.get(start_number) == list.get(end_number)) {
				start_number++;
				end_number--;
			}else {
				cnt++;
				break;
			}
		  }
		  if(cnt > 0) {
			  answer = "NO";
		  }
		  return answer;
		}
	
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
	    
	    String str = scn.nextLine();
	    
	    String answer = palindrome(str);
	  	
	    System.out.println(answer);
	}
}
