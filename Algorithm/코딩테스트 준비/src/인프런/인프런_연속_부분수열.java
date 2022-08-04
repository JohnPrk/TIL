package 인프런;

import java.util.*;

public class 인프런_연속_부분수열 {
	static int cnt;
	public void solution(int num1, int num2, int[] num_arr) {
		
		ArrayList<Integer> list = new ArrayList<>();
		int p = 0;
		int sum = 0;
		
		while(p < num1) { 
			
			if(sum == num2) {
				
				sum += num_arr[p];
				sum -= list.remove(0);
				
				list.add(num_arr[p]);
				cnt++;
				p++;
				System.out.println(list.toString());
//				System.out.println("같다2 :" + list.toString());
			}
			else if(sum > num2) {
//				System.out.println("크다1 :" + list.toString());
				sum -= list.remove(0);
//				System.out.println("크다2 :" + list.toString());
			}
			else if(sum < num2) {
//				System.out.println("작다1 :" + list.toString());
				list.add(num_arr[p]);
				sum += num_arr[p];
				p++;
//				System.out.println("작다2 :" + list.toString());
			}
		}
		if(sum == num2) {
			cnt++;
		}
	}
	
	
	public static void main(String[] args) {
		
		인프런_연속_부분수열 T = new 인프런_연속_부분수열();
		Scanner scn = new Scanner(System.in);
		cnt = 0;
		int num1 = scn.nextInt();
		int num2 = scn.nextInt();
		int[] num_arr = new int[num1];
		
		for(int i=0; i < num1; i++) {
			 num_arr[i] = scn.nextInt();
			
		}
		
		T.solution(num1, num2, num_arr);
		System.out.println(cnt);
	}
}
