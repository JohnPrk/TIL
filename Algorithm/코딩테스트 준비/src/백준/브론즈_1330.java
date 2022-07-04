package 백준;

import java.util.*;

public class 브론즈_1330 {
	
	public static void compare(int A, int B) {
		
		if(A < B) {
			System.out.println("<");
		}
		else if(A == B) {
			System.out.println("==");
		}else {
			System.out.println(">");
		}
	}
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		String[] str_arr = scn.nextLine().split(" ");
		
		compare(Integer.parseInt(str_arr[0]), Integer.parseInt(str_arr[1]));
		
		
		
		
	}
}
