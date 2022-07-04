package 백준;

import java.util.*;

public class 실버_2751 {
		
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
			
		int cnt = scn.nextInt();
			
		ArrayList<Integer> list = new ArrayList<>();
			
		for(int i = 0; i < cnt; i ++) {
			list.add(scn.nextInt());
		}
			
		Collections.sort(list);
			
		for(int j : list) {
			System.out.println(j);
		}
	}
}
