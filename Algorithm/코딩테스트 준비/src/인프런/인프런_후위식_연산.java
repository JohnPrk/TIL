package 인프런;
import java.util.*;
public class 인프런_후위식_연산 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String[] operations = {"+", "-", "*", "%"};
		HashSet<String> hash = new HashSet<>();
		int answer = 0;
		Stack<String> stack = new Stack<>();
		String[] str_array = scn.next().split("");
		for(String s : str_array) {
			if(s.equals("+")) {
				int n = Integer.parseInt(stack.pop()) + Integer.parseInt(stack.pop());
				stack.add(Integer.toString(n));
			}else if(s.equals("-")){
				int n = - Integer.parseInt(stack.pop()) + Integer.parseInt(stack.pop());
				stack.add(Integer.toString(n));
			}else if(s.equals("*")) {
				int n = Integer.parseInt(stack.pop()) * Integer.parseInt(stack.pop());
				stack.add(Integer.toString(n));
			}else if(s.equals("%")) {
				int n = Integer.parseInt(stack.pop()) % Integer.parseInt(stack.pop());
				stack.add(Integer.toString(n));
			}else {
				stack.add(s);
			}
		}
		System.out.println(Integer.parseInt(stack.get(0)));
	}
}
