package 백준;

import java.util.*;

public class 이분탐색_실버_2805 {
	
	public long solution(int num, long target_tree, long[] trees, long start, long end) {
		int mid = 0;
		boolean[] visited = new boolean[(int) end];
		while(start < end) {
			
			
			mid = (int) ((start + end) / 2);
			if(visited[mid]) {
				return mid;
			}
			int truncatedTree = 0;
			
			for(int i=0; i < trees.length; i++) {
				
				if(trees[i] - mid > 0) {
					truncatedTree += (trees[i] - mid);
				}
			}
			
			if(truncatedTree >= target_tree) {
				visited[mid] = true;
				start = mid;
			}
			else {
				visited[mid] = true;
				end = mid;
			}
		}
		return mid;
	}
	
	public static void main(String[] args) {
		
		이분탐색_실버_2805 T = new 이분탐색_실버_2805();
		Scanner scn = new Scanner(System.in);
		
		int num = scn.nextInt();
		long target_tree = scn.nextLong();
		long[] trees = new long[num];
		
		for(int i=0; i < num; i++) {
			trees[i] = scn.nextInt();
		}
		
		Arrays.sort(trees);
		long start_point = 0;
		long end_point = trees[trees.length-1];
		
		long max_height = T.solution(num, target_tree, trees, start_point, end_point);
		
		System.out.println(max_height);
	}
}
