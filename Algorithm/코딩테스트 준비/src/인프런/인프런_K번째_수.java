package 인프런;
import java.util.*;
public class 인프런_K번째_수 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		PriorityQueue<Integer> PQ = new PriorityQueue<>(Collections.reverseOrder());
		int num = scn.nextInt();
		int count = scn.nextInt();
		int answer =0;
		for(int i=0; i < num; i++) {
			PQ.offer(scn.nextInt());
		}
		System.out.println(PQ);
		PQ.poll();
		System.out.println(PQ);
		PQ.poll();
		System.out.println(PQ);
		//		if(num < count) {
//			System.out.println("-1");
//			return;
//		}
//		for(int i=0; i < count; i++) {
//			answer += PQ.poll();
//		}
//		System.out.println(answer);
	}
}
