package 프로그래머스;

import java.util.*;

public class 카카오프렌즈_컬러링_북 {

	static int[] dx;
	static int[] dy;
	static int m;
	static int n;
	static int ans1;
	static int ans2;
	static int tmp;
	
	
	public void DFS(int x, int y, int[][] picture, int tmp_number) {
		
		int[][] clone = picture;
		if(clone[x][y] == 10 || clone[x][y] == 0) {
			return;
		}
		
		
		clone[x][y] = 10;
		tmp ++;
		for (int i=0; i < dx.length; i++) {
			
			int nx = x + dx[i];
			int ny = y + dy[i];
			
			
			if(nx >= 0 && nx < m && ny >= 0 && ny < n) {
				
				if (clone[nx][ny] == tmp_number) {
					DFS(nx, ny, clone, tmp_number);
				}
			}
		}
	}
	
	
	
	public int[] solution(int x, int y, int[][] picture) {
		int[] answer = new int[2];
		
		dx = new int[] {1,0,-1,0};
		dy = new int[] {0,-1,0,1};
		
		ans2 = Integer.MIN_VALUE;
		
		
		for(int i =0; i < x; i++) {
			for(int j=0; j < y; j++) {
				if(picture[i][j] != 10 && picture[i][j] != 0) {
					int tmp_number = picture[i][j];
					tmp =0;
					ans1++;
					DFS(i,j,picture, tmp_number);
					
					if(ans2 < tmp) {
						ans2 = tmp;
					}
				}
				
			}
		}
		
		int answer1 = ans1;
		int answer2 = ans2;
		
		answer[0] = answer1;
		answer[1] = answer2;

		return answer;
    }
	
	
	public static void main(String[] args) {
		
		카카오프렌즈_컬러링_북 T = new 카카오프렌즈_컬러링_북();
		
		m = 6;
		n = 4;
		int[][] picture = new int [][] {{1, 1, 1, 0}, {1, 1, 1, 0}, {0, 0, 0, 1}, {0, 0, 0, 1}, {0, 0, 0, 1}, {0, 0, 0, 1}};
	
		T.solution(m, n, picture);
		
		System.out.println(ans1);
		System.out.println(ans2);
		
		
	}
}
