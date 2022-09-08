package 백준;
import java.util.*;

public class DP_실버_2579 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
	
		int[] score = new int[num + 1];
		int[] stair = new int[num +1];
		for(int i=1; i <= num; i++) {
			stair[i] = scn.nextInt();
		}
		score[1] = stair[1];
		score[2] = stair[1] + stair[2];
		for(int i=3; i <= num; i++) {
			score[i] = Math.max(score[i-3] + stair[i-1] + stair[i], score[i-2] + stair[i]);
		}
		
		System.out.println(score[num]);
	}
}
