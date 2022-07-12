package 인프런;
	
import java.util.*;
import java.util.stream.Collectors;

public class 인프런_동전_교환 {

	static int cnt;
	static int[] int_arr;
	static int min = Integer.MAX_VALUE;
	static int cash;
	static int answer;
	static int while_cnt;
	static int[] ch;
	
	public void DFS(int D, int sum) {
		
		if(sum > cash) {
			return;
		}if(D >= answer) {
			return;
		}
		if(sum == cash) {
			answer = Math.min(answer, D);
		}else {
			for(int i=0; i < D; i++) {
				DFS(D+1, sum+int_arr[i]);
			}
			
		}
	}
	
	public void solution() {
		DFS(0,0);
	}
	
	public static void main(String[] args) {
	
		인프런_동전_교환 T = new 인프런_동전_교환();
		
		Scanner scn = new Scanner(System.in);
		
		
		cnt = scn.nextInt();
		int[] tmp_arr = new int[cnt];
		int_arr = new int[cnt];
		
		for(int i =0; i< cnt; i++) {
			tmp_arr[i] = scn.nextInt();
		}
		
//		Arrays.sort(tmp_arr, reverse);
		
	   
	   
	    
		cash = scn.nextInt();
		
		T.solution();
		
		System.out.println(answer);
	}
}
