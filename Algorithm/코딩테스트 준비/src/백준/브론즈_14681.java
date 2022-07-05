package 백준;

import java.util.*;

public class 브론즈_14681 {
	
	public static int coordinate(int x, int y) {
		
		if(x > 0 && y > 0) {
			return 1;
		}else if(x < 0 && y > 0) {
			return 2;
		}else if(x > 0 && y < 0) {
			return 3;
		}else {
			return 4;
		}
			
	}
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int first_number = scn.nextInt();
		int second_number = scn.nextInt();
		
		
		int answer = coordinate(first_number, second_number);
		
		System.out.println(answer);
	}
}
