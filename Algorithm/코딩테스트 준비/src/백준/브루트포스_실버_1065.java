package 백준;
import java.util.*;
public class 브루트포스_실버_1065 {
	static int answer;
	public static void check(int i) {
		if(i < 100) {
			answer ++;
			return;
		}
		String[] s = Integer.toString(i).split("");
//		System.out.println(s.length);
		for(int j=1; j < s.length -1; j++) {
			if(Integer.parseInt(s[j+1]) - Integer.parseInt(s[j]) == Integer.parseInt(s[j]) - Integer.parseInt(s[j-1])) {
				System.out.println(i);
				System.out.println(j + " " + (Integer.parseInt(s[j+1]) - Integer.parseInt(s[j])));
				System.out.println(j + " " + (Integer.parseInt(s[j]) - Integer.parseInt(s[j-1])));
				answer ++;
			}else {
				break;
			}
			
			
		}
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		answer = 0;
		for(int i=1; i <= num; i++) {
			check(i);
		}
//		System.out.println(answer);
		
	}
}
