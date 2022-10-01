package 프로그래머스;
import java.util.*;
public class 순열_줄_서는_방법 {
	static boolean[] visited;
	static ArrayList<int[]> list;
	public static void permutation(int depth, int[] array, int n, int r, int k) {
		if(depth == r) {
			int[] tmp = new int[n];
			for(int i=0; i < tmp.length; i++) tmp[i] = array[i];
			list.add(tmp);
			return;
		}
		for(int i=1; i <= n; i++) {
			if(!visited[i]) {
				visited[i] = true;
				array[depth] = i;
				permutation(depth+1, array, n, r, k);
				visited[i] = false;
				if(list.size() == k) {
					return;
				}
			}
		}	
	}
	public static void main(String[] args) {
		int n = 3;
		int k = 5;
		visited = new boolean[n+1];
		int[] array = new int[n];
		list = new ArrayList<>();
		permutation(0, array, n, n, k);
		return 
			
		
		
	}
}
