package 인프런;

import java.util.*;

class Point{
	int col;
	int row;
	
	public Point(int col, int row) {
		this.col = col;
		this.row = row;
	}
}

public class 인프런_피자_배달_거리 {
	
	
	
	static int n, m, len, answer=Integer.MAX_VALUE;
	static int[] combi;
	static ArrayList<Point> house, pizza;
	
	public static void DFS(int D, int start) {
		
		if(D == m) {
			int sum = 0;
			
			for(Point h : house) {
				int temp=Integer.MAX_VALUE;
				
				for(int c : combi) {
					temp = Math.min(temp, Math.abs(h.col - pizza.get(c).col) + Math.abs(h.row - pizza.get(c).row));
				}
				sum += temp;
			}
			
			answer = Math.min(answer, sum);
			
			
		}else {
			for(int k=start; k < len; k++) {
				combi[D] = k;
				DFS(D+1, k+1);
			}
			
		
		}
	}
	
	
	public void solution() {
		
		DFS(0,0);
	}
	
	public static void main(String[] args) {
		
		인프런_피자_배달_거리 t = new 인프런_피자_배달_거리();
		
		Scanner scn= new Scanner(System.in);
		
		n = scn.nextInt();
		m = scn.nextInt();
		
		house = new ArrayList<>();
		pizza = new ArrayList<>();
		
		for(int i =0; i<n; i++) {
			for(int j=0; j<n; j++) {
				int tmp = scn.nextInt();
				if(tmp == 1) {
					house.add(new Point(i,j));
				}else if(tmp == 2) {
					pizza.add(new Point(i,j));
				}
			}
		}
		len = pizza.size();
		combi = new int[m];
		
		t.solution();
		
		System.out.println(answer);
	}
}
