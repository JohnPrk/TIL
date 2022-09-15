package 백준;
import java.util.*;
public class 시뮬레이션_골드_14719 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int answer =0;
		int x = scn.nextInt();
		int y = scn.nextInt();
		int[] numbers = new int[y];
		for(int i=0; i < numbers.length; i++) numbers[i] = scn.nextInt();
		for(int i=1; i < numbers.length-1; i++) {
			int current = numbers[i];
			int left = current;
			int right = current;
			for(int j= i-1; j >= 0; j--) if(numbers[j] > current) left = Math.max(left, numbers[j]);
			for(int j= i+1; j < numbers.length; j++) if(numbers[j] > current) right = Math.max(right, numbers[j]);
			if(Math.max(left, right) > current) answer += Math.min(left, right) - numbers[i];
		}
		System.out.println(answer);
	}
}
