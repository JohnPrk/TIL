package 인프런;
import java.util.*;
public class 인프런_최대_길이_연속부분수열 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		int change = scn.nextInt();
		int max = Integer.MIN_VALUE;
		int[] numbers= new int[num];
		for(int i =0; i < num; i++)  {
			numbers[i] = scn.nextInt();
		}
		int cnt = 0;
		int lt =0;
		int rt =0;
		
		while(rt < num) {
			if(cnt > change) {
				if(numbers[lt] == 1) {
					lt++;
				}else {
					cnt --;
					lt++;
				}
			}else {
				if(numbers[rt] == 1) {
					max = Math.max(max, rt-lt+1);
					rt ++;
				}
				else {
					cnt++;
					rt++;
				}
			}
		}
		System.out.println(max);
	}
}
