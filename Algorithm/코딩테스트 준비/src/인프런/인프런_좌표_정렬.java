package 인프런;

import java.util.*;

class Point1 implements Comparable<Point1> {
	int x, y;
	
	Point1(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public int compareTo(Point1 o) {
		
		if(this.x == o.x) {
			return o.y - this.y;
		}else {
			return o.x - this.x;
		}
		
	}
}

public class 인프런_좌표_정렬 {

	
	
	
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int num = scn.nextInt();
		ArrayList<Point1> list = new ArrayList<>(); 
		
		for(int i=0; i < num; i++) {
			
			int x = scn.nextInt();
			int y = scn.nextInt();
			
			list.add(new Point1(x, y));
		}
		
		Collections.sort(list);
		
		for(Point1 p : list) {
//			System.out.println(p.x + " " + p.y);
		}
	}
}
