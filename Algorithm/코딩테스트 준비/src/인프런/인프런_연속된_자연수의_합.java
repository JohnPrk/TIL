package 인프런;

import java.util.*;

public class 인프런_연속된_자연수의_합 {
	static int cnt;
	
	public void solution(int num) {
		
		int sum=0;
		ArrayList<Integer> list = new ArrayList<>();
		int p =1;
		
		while(p < num) {
			System.out.println(list.toString());
			System.out.println(sum);
			if(sum == num) {
				System.out.println(p);
				cnt ++;
				list.remove(0);
				sum+= p;
				sum -= list.remove(0);
				list.add(p);
				p++;
				
			}else if(sum > num) {
				sum -= list.remove(0);
			}else if(sum < num) {
				sum+= p;
				list.add(p);
				p++;
			}
			
		}
	}
	
	public static void main(String[] args) {
		
		인프런_연속된_자연수의_합 T = new 인프런_연속된_자연수의_합();
		Scanner scn = new Scanner(System.in);
		cnt = 0;
		int num = scn.nextInt();
		
		T.solution(num);
		
		System.out.println(cnt);
		
	}
}
