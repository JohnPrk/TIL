package 인프런;

import java.util.*;
public class 인프런_올바른_괄호 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String[] str_array = scn.next().split("");
		Stack<String> stack = new Stack<>();
		for(String s : str_array) {
			if(s.equals(")")) {
				if(stack.isEmpty()) {
					System.out.println("NO");
					return;
				}else stack.pop();	
			}else stack.add(s);
		}
		if(stack.isEmpty()) System.out.println("YES");
		else System.out.println("NO");
	}
}
