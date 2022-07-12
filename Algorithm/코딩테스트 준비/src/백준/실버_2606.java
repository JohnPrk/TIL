package 백준;

import java.util.*;

public class 실버_2606 {

	static int computer;
	static int connection;
	static int answer;
	
	
	public void DFS(int[][] adjacency_matrix, boolean[] check_arr, int start) {
		
		if(check_arr[start] = true) {
			return;
		}
		check_arr[start] = true;
		answer++;
		
		for(int j=0; j < adjacency_matrix[start].length; j++) {
			if(adjacency_matrix[start][j] == 1 && !check_arr[start]) {
				DFS(adjacency_matrix, check_arr, j);
			}
		}
		
		
	}
	
	public void solution(int[][] adjacency_matrix, boolean[] check_arr) {
		
		DFS(adjacency_matrix, check_arr, 1);
	}
	
	
	public static void main(String[] args) {
		
		실버_2606 t = new 실버_2606();
		
		Scanner scn = new Scanner(System.in);
		
		computer = scn.nextInt();
		connection = scn.nextInt();
		
		int[][] adjacency_matrix = new int[computer+1][computer+1];
		boolean[] check_arr = new boolean[computer+1];
		
		
		for(int i =0; i < connection; i++) {
			int start_point = scn.nextInt();
			int end_point = scn.nextInt();
		
			adjacency_matrix[start_point][end_point] = 1;
			adjacency_matrix[end_point][start_point] = 1;
			
		}
		
		
		t.solution(adjacency_matrix, check_arr);
		
		System.out.println(answer);
	}
}
