package 인프런;

import java.util.*;

public class 인프런_연속된_자연수의_합 {
	
	public static void main(String[] args) {
	
		Scanner scn = new Scanner(System.in);
		int cnt =0;
		int num = scn.nextInt();
		int lt =1;
		int rt =2;
		int sum = lt+rt;
		while(lt < rt) {
			if(sum == num) {
				cnt++;
				sum -= lt++;
				sum += ++rt;
			}else if(sum > num){
				sum -= lt++;
			}else {
				sum += ++rt; 
			}
		}
		System.out.println(cnt);	
	}
}
