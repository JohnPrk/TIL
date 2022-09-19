package 백준;
import java.util.*;

public class 브루트포스_실버_14888 {
	static HashSet<String[]> operations;
	public static void Permutations(int depth, int end, Stack<String> hash, String[] array, String[] op) {
		
		
		
			
		
		
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		String[] op = new String[] {"+", "-", "*", "%"};
		int count = 0;
		operations = new HashSet<>();
		
		Stack<String> stack = new Stack<>();
		Stack<String> copy = new Stack<>();
		int[] numbers = new int[num];
		for(int i=0; i < num; i++) numbers[i] = scn.nextInt(); 
		for(int i=0; i < 4; i++) {
			int cnt = scn.nextInt();
			if(cnt>= 1) for(int j =0; j < cnt; j++) stack.add(op[j]);
		}
		for(int i =0; i < stack.size(); i++) copy.add(stack.pop());
		Permutations(0, count, copy, new String[count], op);
		
	}
}
