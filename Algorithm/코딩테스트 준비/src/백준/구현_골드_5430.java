package 백준;

import java.util.*;

public class 구현_골드_5430 {
	
	public static void makeStringToArray(String array) {
		array = array.replace("[", "");
		array = array.replace("]", "");
		String[] str_array = array.split(",");
		
		int[] int_array = new int[str_array.length];
		int cnt =0;
		if(str_array[0] == "") {
			System.out.println("error");
			return;
		}
//		for(String s : str_array) {
//			System.out.println(s + "ss");
//		}
//		for(String s : str_array) int_array[cnt++] =Integer.parseInt(s);
		
	}
	public static void reverse() {
		
	}
	public static void pop() {
		
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int cnt = scn.nextInt();
		while(cnt-- >0) {
			String functions = scn.next();
			int num = scn.nextInt();
			String array = scn.next();
			makeStringToArray(array);
		}
		
		
		
		
	}
}
