package 인프런;

import java.util.*;

class startEndPosition implements Comparable<startEndPosition>{
	int start, end;
	

	public startEndPosition(int start, int end) {
		this.start = start;
		this.end = end;
	}
	@Override
	public int compareTo(startEndPosition o) {
		if(this.end == o.end) {
			return this.start - o.start;
		}else {
			return this.end - o.end;
		}
		
		
	}
}

public class 인프런_회의실_배정 {

	static int answer;
	static int max;
	public void solution(ArrayList<startEndPosition> list) {
		
		Collections.sort(list);
		
		for(startEndPosition s : list) {
			if(max <= s.start) {
				
				max = s.end;
				answer ++;
			}
		}
	}
	
	public static void main(String[] args) {
	
		인프런_회의실_배정 T = new 인프런_회의실_배정();
		Scanner scn = new Scanner(System.in);
		ArrayList<startEndPosition> list = new ArrayList<>();
		answer = 0;
		max = Integer.MIN_VALUE;
		int cnt = scn.nextInt();
		
		
		for(int i=0; i < cnt; i++) {
			 list.add(new startEndPosition(scn.nextInt(), scn.nextInt()));
		}
		
		T.solution(list);
		System.out.println(answer);
	}
}
