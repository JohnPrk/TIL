package 백준;

import java.util.*;

public class 실버_2751 {
		
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int num = scn.nextInt();
		PriorityQueue<Integer> PQ= new PriorityQueue<>();
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0; i < num; i++) list.add(scn.nextInt());
		Collections.sort(list);
		for(int l : list) sb.append(l + "\n");
		System.out.println(sb);
	}
}
