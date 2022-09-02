package 백준;

import java.util.*;

public class 자료구조_실버_수_찾기_1920 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		HashSet<Integer> list1 = new HashSet<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		int num1 = scn.nextInt();
		while(num1-- > 0) list1.add(scn.nextInt());
		int num2 = scn.nextInt();
		while(num2-- > 0) list2.add(scn.nextInt());
	
		for(int n : list2) {
			if(list1.contains(n)) System.out.println(1);
			else System.out.println(0);
		}
	}
	
}
