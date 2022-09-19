package 인프런;
import java.util.*;
public class 인프런_괄호_문자_제거 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Stack<String> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();
		String[] str_array = scn.next().split("");
		for(String s : str_array) {
			if(s.equals(")")) {
				while(!stack.peek().equals("(")) stack.pop();
				stack.pop();
			}else stack.add(s);
		}
		for(String s : stack) sb.append(s);
		System.out.println(sb);
	}
}
