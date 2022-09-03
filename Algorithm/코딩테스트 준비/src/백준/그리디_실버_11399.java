package 백준;

import java.util.*;

public class 그리디_실버_11399 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int cnt = scn.nextInt();
		int answer =0;
		ArrayList<Integer> list = new ArrayList<>();
		while(cnt-- >0) list.add(scn.nextInt());
		Collections.sort(list);
		for(int i=0; i <list.size();i++) {
			for(int j=0; j<=i; j++) {
				answer += list.get(j);
			}
		}
		System.out.println(answer);
	}
}
