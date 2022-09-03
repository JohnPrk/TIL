package 백준;
import java.util.*;

public class 큐_실버_1158 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int number = scn.nextInt();
		int K = scn.nextInt();
		Queue<Integer> Q = new LinkedList<>();
		String answer = "<";
		for(int i=1; i <= number; i++) {
			Q.add(i);
		}
		while(Q.size() > 1) {
			for(int i=0; i < K-1; i++) {
				Q.offer(Q.poll());
			}
			answer += Q.poll() + ", ";
		}
		answer += Q.poll();
		answer += ">";
		System.out.println(answer);
	}
}
