package 인프런;
import java.util.*;
public class 인프런_공주_구하기 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Queue<Integer> Q = new LinkedList<>();
		int num = scn.nextInt();
		int target_num = scn.nextInt();
		int cnt = 0;
		for(int i=1; i <= num; i++) Q.add(i);
		while(Q.size() != 1) {
			cnt ++;
			if(cnt == target_num) {
				Q.poll();
				cnt = 0;
			}else Q.add(Q.poll());
		}
		System.out.println(Q.poll());
	}
}
