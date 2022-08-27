package 백준;

import java.util.*;

public class 구현_실버_4673 {
	
	public static void main(String[] args) {
		int[] int_array = new int[13000];
		for(int i=1; i<=10000; i++) {
			int sum =i;
			String[] tmp = Integer.toString(i).split(""); 
			for(String t : tmp) {
				sum += Integer.parseInt(t);
			}
			int_array[sum] = 1;
		}
		
		for(int i=1; i<=10000; i++) {
			if(int_array[i] ==0) System.out.println(i);
		}
	}
}
