package 인프런;

import java.util.*;
public class 인프런_중복_확인2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		int[] numbers = new int[num];
		String answer = "U";
		
		for(int i=0; i < num; i++) numbers[i] = scn.nextInt();
		Arrays.sort(numbers);
		for(int i=1; i <num; i++) {
			if(numbers[i] == numbers[i-1]) {
				answer = "D";
				break;
			}
		}
		System.out.println(answer);
	}
}
