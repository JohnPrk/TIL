package 백준;
import java.util.*;

public class 브루트포스_실버_14888 {
	static ArrayList<Integer> ans;
	public static void DFS(String operation) {
		
		
		
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		String[] op = new String[] {"+", "-", "*", "%"};
		ArrayList<String> operation = new ArrayList<>();
		int[] numbers = new int[num];
		int[] copy = new int[numbers.length];
		ans = new ArrayList<>();
		for(int i=0; i < num; i++) numbers[i] = scn.nextInt(); 
		for(int i=0; i < 4; i++) {
			int cnt = scn.nextInt();
			if(cnt>= 1) for(int j =0; j < cnt; j++) operation.add(op[i]);
		}
		for(int i=0; i < numbers.length; i++) copy[i] = numbers[i];
		for(int i=0; i < operation.size(); i++) {
			DFS(operation.get(i));
			DFS("");
		}
//		DFS(0, numbers[0], copy, operation);
		
	}
}
