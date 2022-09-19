package 백준;
import java.util.*;

public class 브루트포스_실버_14888 {
	static HashSet<String[]> operations;
	public static HashSet<String[]> Permutations(int depth, int end, HashMap<String, Integer> hash, String[] array, String[] op) {
		if(depth  == (end-1)) {
			operations.add(array);
		}else {
			for(int i=0; i < 4; i++) {
				int cnt = hash.getOrDefault(op[i], 0);
				for(int j =0; j < cnt; j++) {
					array[depth] += op[i];
					hash.put(op[i], hash.get(op[i])-1);
				}
			}
		}
		
		
			
		
		
		return operations;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		String[] op = new String[] {"+", "-", "*", "%"};
		int count = 0;
		operations = new HashSet<>();
		HashMap<String, Integer> hash = new HashMap<>();
		Stack<String> stack = new Stack<>();
		Stack<String> copy = new Stack<>();
		int[] numbers = new int[num];
		for(int i=0; i < num; i++) numbers[i] = scn.nextInt(); 
		for(int i=0; i < 4; i++) {
			int cnt = scn.nextInt();
			if(cnt>= 1) for(int j =0; j < cnt; j++) stack.add(op[j]);
		}
		for(int i =0; i < stack.size(); i++) copy.add(stack.pop());
		Permutations(0, count, hash, new String[count], op);
		
	}
}
