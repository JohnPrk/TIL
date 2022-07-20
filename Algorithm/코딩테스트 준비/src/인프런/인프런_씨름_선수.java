package 인프런;

import java.util.*;

class Point2 implements Comparable<Point2> {

	int x, y;

	Point2(int x, int y) {

		this.x = x;
		this.y = y;
	}

	@Override
	public int compareTo(Point2 o) {

		if (this.x == o.x) {
			return o.y - this.y;
		} else {
			return o.x - this.x;
		}
	}
}

public class 인프런_씨름_선수 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		ArrayList<Point2> list = new ArrayList<>();
		int max = Integer.MIN_VALUE;
		int answer = 0;

		int num = scn.nextInt();

		for (int i = 0; i < num; i++) {

			int x = scn.nextInt();
			int y = scn.nextInt();

			list.add(new Point2(x, y));
		}

		Collections.sort(list);
		
		for (Point2 p : list) {
			if (max < p.y) {
				answer++;
				max = p.y;
			}
		}

		System.out.println(answer);
	}
}