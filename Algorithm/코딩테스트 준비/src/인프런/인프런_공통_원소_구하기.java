package 인프런;

import java.util.*;

public class 인프런_공통_원소_구하기 {

	
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		ArrayList<String> list1 = new ArrayList<>();
		ArrayList<String> list2 = new ArrayList<>();
		ArrayList<Integer> union = new ArrayList<>();
		String answer = ""; 
		
		int num = scn.nextInt();
		
		for(int i=0; i < num; i++) {
			list1.add(scn.next());
		}
		
		num = scn.nextInt();
		
		for(int i=0; i < num; i++) {
			list2.add(scn.next());
		}
		
		
		
		for(String i : list1) {
			if(list2.remove(i)) {
				union.add(Integer.parseInt(i));
			}
		}
		
		Collections.sort(union);
		
		for(int u : union) {
			answer += u + " ";
			
		}
		answer = answer.trim();
		
		System.out.println(answer);
	}
}
