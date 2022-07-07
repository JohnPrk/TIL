package 인프런;

import java.util.*;

public class 인프런_가장_짧은_문자거리 {

	public static String shortCharacterDistance(String s1, String s2) {
		
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		
		char target_chr = s2.charAt(0);
		
		char[] chr_arr = s1.toCharArray();
		
		int cnt = 0;
		String answer = "";
		
		for(int i = 0; i < chr_arr.length; i ++) {
			if (i == 0 && chr_arr[i] != target_chr) {
				list1.add(1000);
				cnt ++;
			}else if(i == 0 && chr_arr[i] == target_chr) {
				cnt = 0; 
				list1.add(0);
			}
			else if(chr_arr[i] == target_chr) {
				cnt = 0; 
				list1.add(0);
			}else {
				cnt ++;
				list1.add(cnt);
			}
		}
		
		for(int j = chr_arr.length-1; j >= 0; j --) {
			if (j == chr_arr.length-1 && chr_arr[j] != target_chr) {
				list2.add(1000);
			}else if(j == chr_arr.length-1 && chr_arr[j] == target_chr) {
				cnt = 0; 
				list2.add(0);
			}
			else if(chr_arr[j] == target_chr) {
				cnt = 0; 
				list2.add(0);
			}else {
				cnt ++;
				list2.add(cnt);
			}
		}
		Collections.reverse(list2);
		
		
		for(int k = 0; k < list1.size(); k++) {
			answer += Math.min(list1.get(k), list2.get(k));
			answer += " ";
		}
		
		
		answer = answer.trim();
		
		
		return answer;
	}
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		String[] str_arr = scn.nextLine().split(" ");
		
		
		String answer = shortCharacterDistance(str_arr[0], str_arr[1]);
		
		System.out.println(answer);
	}
}
