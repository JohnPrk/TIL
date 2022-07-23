package 인프런;

import java.util.*;

public class 인프런_두_배열_합치기 {

	
	
	public String solution(int n, int m, int[] num_Arr1, int[] num_Arr2) {
		
		int p1 = 0;
		int p2 = 0;
		String answer = "";
		
		while(p1 < n && p2 < m) {
			
			if(num_Arr1[p1] > num_Arr2[p2]) {
				answer += num_Arr2[p2] + " ";
				p2++;
			}else {
				answer += num_Arr1[p1] + " ";
				p1++;
			}
		}
		while(p1 < n) {
			answer += num_Arr1[p1] + " ";
			p1++;
		}
		while(p2 < m) {
			answer += num_Arr2[p2] + " ";
			p2++;
		}

		return answer;
	}
	
	public static void main(String[] args) {
		
		인프런_두_배열_합치기 T = new 인프런_두_배열_합치기();
		Scanner scn = new Scanner(System.in);
		
		int n= scn.nextInt();
		int[] num_Arr1= new int[n];
		
		for(int i=0; i < n; i++) {
			num_Arr1[i] = scn.nextInt();
		}
		
		int m= scn.nextInt();
		int[] num_Arr2= new int[m];
		
		for(int i=0; i < m; i++) {
			num_Arr2[i] = scn.nextInt();
		}
		
		
		String answer = T.solution(n, m, num_Arr1, num_Arr2);
		
		answer = answer.trim();
		
		System.out.println(answer);
	}
}
