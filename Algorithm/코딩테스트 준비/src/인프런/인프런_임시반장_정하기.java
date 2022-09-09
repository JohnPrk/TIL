package 인프런;

import java.util.*;

public class 인프런_임시반장_정하기 {
	
	public static void main(String[] args ) {
		Scanner scn = new Scanner(System.in);
		int answer = 0;
		int max = Integer.MIN_VALUE;
		int num = scn.nextInt();
		int[][] board = new int[num+1][6];
		
		for(int i=1; i<=num; i++) {
			for(int j=1; j< 6; j++) {
				board[i][j] = scn.nextInt();
			}
		}
		HashMap<Integer, Integer> hash = new HashMap<>();
		for(int i = 1; i <= num; i++) {
			for(int j=1; j <= num; j++) {
				for(int k=1; k < 6; k++) {
					if(board[i][k] == board[j][k]) {
						hash.put(i, hash.getOrDefault(i, 0)+1);
						break;
					}
				}
			}
		}
//		System.out.println(hash);
		for(int key : hash.keySet()) {
			if(max < hash.get(key)) {
				max = hash.get(key);
				answer = key;
			}
		}
		System.out.println(answer);
	}
}
