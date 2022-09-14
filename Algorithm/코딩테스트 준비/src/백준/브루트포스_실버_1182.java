package 백준;
import java.util.*;

public class 브루트포스_실버_1182 {
	static int answer;
	public static void DFS (int depth, int sum, int num, int target_number, int[] numbers) {
		
		if(depth == num) {
			if(sum == target_number) answer++;
			return;
		}
		DFS(depth+1, sum+numbers[depth], num, target_number, numbers);
		DFS(depth+1, sum, num, target_number, numbers);
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		int target_number = scn.nextInt();
		int[] numbers = new int[num];
		answer =0;
		for(int i=0; i< num; i++) numbers[i] = scn.nextInt();
		DFS(0, 0, num, target_number, numbers);
		if(target_number ==0 ) answer --;
		System.out.println(answer);
	}
}
