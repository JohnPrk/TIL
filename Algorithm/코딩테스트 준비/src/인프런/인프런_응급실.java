package 인프런;
import java.util.*;
class Hospital {
	int order, risk;
	public Hospital(int order, int risk) {
		this.order = order;
		this.risk = risk;
	}
}
public class 인프런_응급실 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		int target_num = scn.nextInt();
		int answer = 0;
		int  cnt = 0;
		Queue<Hospital> Q = new LinkedList<>();
		while(num-- > 0) Q.add(new Hospital(cnt++, scn.nextInt()));
		while(!Q.isEmpty()) {
			Hospital tmp = Q.poll();
			int count = 0;
			for(Hospital h : Q) if(tmp.risk < h.risk) count++;
			if(count ==0) {
				answer ++;
				if(tmp.order== target_num) {
					System.out.println(answer);
					break;
				}
			}
			else Q.add(tmp);
		}
	}
}
