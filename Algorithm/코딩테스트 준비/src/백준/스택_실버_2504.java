package 백준;
import java.util.*;
public class 스택_실버_2504 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Stack<String> stack = new Stack<>();
		String[] str_array = scn.next().split("");
		for(String s : str_array) {
			if(s.equals(")")) {
				
			}else if(s.equals("]"))  {
				
			}
			stack.add(s);
		}
	}
}
