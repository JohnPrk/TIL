package 백준;

import java.util.*;

public class 브론즈_2884 {
	
	public static void alarmSet(int h, int m) {
		if(m - 45 < 0) {
			if (h - 1 < 0) {
				h = 23;
				m += 15;
			}else {
				h -= 1;
				m += 15;
			}
			
		}else {
			m -= 45;
		}
		
		
		System.out.println(h + " " + m);
	}
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		String[] str_arr = scn.nextLine().split(" ");
		
		alarmSet(Integer.parseInt(str_arr[0]), Integer.parseInt(str_arr[1]));
		
	}
}
