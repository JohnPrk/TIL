package 백준;

import java.util.*;

public class 브론즈_2739 {
	
	public static void gugudan(int num) {
		
		for(int i = 1; i <=9 ; i++) {
			
			System.out.println(num + " * " + i + " = " + num * i);
		}
	}
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int num = scn.nextInt();
		gugudan(num);
	}
}
