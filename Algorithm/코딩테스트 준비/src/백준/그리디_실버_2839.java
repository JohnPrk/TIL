package 백준;
import java.util.*;

public class 그리디_실버_2839 {

	public static void main(String[] args) {
		int[] split = new int[] {5,3,1};
		Scanner scn = new Scanner(System.in);
		int killogram = scn.nextInt();
		int answer =0;
		
		while (true) {
			if(killogram % 5 ==0) {
				answer += killogram/5;
				System.out.println(answer);
				break;
			}else {
				killogram -=3;
				answer ++;
			}
			if(killogram < 0) {
				System.out.println(-1);
				break;
			}
		}
	}
}
