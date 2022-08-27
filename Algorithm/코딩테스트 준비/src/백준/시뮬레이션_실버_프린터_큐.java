package 백준;

import java.util.*;

class Printer {
	int order, priority;
	
	public Printer(int order, int priority) {
		this.order = order;
		this.priority = priority;
	}
}
public class 시뮬레이션_실버_프린터_큐 {
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		
		while(num-- > 0) {
			LinkedList<Printer> q = new LinkedList<>();
			
			int cnt = scn.nextInt();
			int idx = scn.nextInt();
			int max = Integer.MIN_VALUE;
			
			for(int order=0; order<cnt; order++) {
				q.offer(new Printer(order, scn.nextInt()));
			}
			int count =0;
			while(!q.isEmpty()) {
				Printer tmp = q.poll();
				boolean isMax = true;
				
				for(int j=0; j < q.size(); j++) {
					if(tmp.priority < q.get(j).priority) {
						q.offer(tmp);
						for(int k=0; k < j; k++) {
							q.offer(q.poll());
						}
						isMax = false;
						break;
					}
				}
				if(isMax == false) continue;
				count ++;
				if(tmp.order == idx) break;
			}
			System.out.println(count);
		}
	}
}
