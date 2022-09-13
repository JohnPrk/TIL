package 백준;
	
import java.util.*;

public class 우선순위큐_실버_1927 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		PriorityQueue<Integer> PQ = new PriorityQueue<Integer>();
		int num = scn.nextInt();
		while(num-- > 0) {
			int tmp = scn.nextInt();
			if(tmp == 0) {
				if(PQ.size() ==0) {
					System.out.println("0");
				}
				else {
					System.out.println(PQ.poll());
				}
			}else {
				PQ.add(tmp);
			}
		}
	}
}
