package 백준;

import java.util.*;

public class 스택_실버_1874 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		StringBuilder sb = new StringBuilder();
		
		Stack<Integer> stack = new Stack<>();
		int start = 0;

		while(num-- > 0) {
			int value = scn.nextInt();
			if(value > start) {
				for(int i=start+1; i <= value; i++) {
					stack.push(i);
					sb.append("+\n");
				}
				start = value;
			}
			else if(stack.peek() != value){
				System.out.println("NO");
				return;
			}
			stack.pop();
			sb.append("-\n");
		}
		System.out.println(sb);
	}
}
