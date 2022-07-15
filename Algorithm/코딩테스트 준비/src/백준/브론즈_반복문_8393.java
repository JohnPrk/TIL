package 백준;

import java.util.*;

public class 브론즈_반복문_8393 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int cnt = scn.nextInt();
		int answer =0;
		
		for(int i=1; i <= cnt; i++) {
			answer += i;
		}
		
		System.out.println(answer);
	}
}
