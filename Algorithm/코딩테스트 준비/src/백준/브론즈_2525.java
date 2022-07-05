package 백준;

import java.util.*;


public class 브론즈_2525 {
	
	public static void alarmSet(int h, int m, int plus) {
		
		// 60분을 넘을  
		if(m + plus >= 60) {
			
			// 24시를 넘을 경우
			if(h + (m + plus) / 60 >= 24) {
				h = h + (m + plus) / 60 - 24 ;
				m = m + plus - 60 * ((m + plus) / 60);
			}
			
			//24시를 넘지 않을 경우
			else {
				h += (m + plus) / 60;
				m += plus - 60 * ((m + plus) / 60);
			}
		}
		// 60분을 넘지 않을 경우
		else {
			m += plus;
		}
		
		System.out.println(h + " " + m);
	}
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		String[] str_arr = scn.nextLine().split(" ");
		int plus = scn.nextInt();
	
		alarmSet(Integer.parseInt(str_arr[0]), Integer.parseInt(str_arr[1]), plus);
	}
}
