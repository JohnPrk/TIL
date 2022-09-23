package 인프런;
import java.util.*;

public class 인프런_쇠막대기 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String[] str_array = scn.next().split("");
		Stack<String> stack = new Stack<>();
		int answer = 0;
		stack.add(str_array[0]);
		for(int i =1; i < str_array.length; i++) {
			if(str_array[i].equals(")")) {
				stack.pop();
				if(str_array[i-1].equals("(")) answer += stack.size();
				else answer += 1;
			}else stack.add(str_array[i]);
		}
		System.out.println(answer);
	}
}
