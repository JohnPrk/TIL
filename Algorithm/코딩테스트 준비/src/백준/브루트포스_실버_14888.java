package 백준;
import java.util.*;

public class 브루트포스_실버_14888 {
	static HashSet<String[]> operations;
	public static HashSet<String[]> Permutations(int depth, int end, HashMap<String, Integer> hash, String[] array) {
		if(depth  == (end-1)) {
			
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
		int[] numbers = new int[num];
		int[] copy = new int[numbers.length];
		for(int i=0; i < num; i++) numbers[i] = scn.nextInt(); 
		for(int i=0; i < 4; i++) {
			int cnt = scn.nextInt();
			if(cnt>= 1) for(int j =0; j < cnt; j++) {
				hash.put(op[i], hash.getOrDefault(op[i], 0) + 1);
				count ++;
			}
		}
		for(int i=0; i < numbers.length; i++) copy[i] = numbers[i];
		Permutations(0, count, hash, new String[5]);
		
	}
}
