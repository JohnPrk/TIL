package 프로그래머스;

import java.util.*;

class Point {
	
	int x;
	int y;
	
	Point(int x, int y) {
		this.x =x;
		this.y =y;
	}
}
public class 게임_맵_최단거리 {
	
    
    public void DFS(int x, int y, int[][] maps, int[][] dis) {
		
		int[] dx = {0, 1, 0, -1};
		int[] dy = {1, 0, -1, 0};
		
		Queue<Point> Q = new LinkedList<>();
		
		Q.offer(new Point(x,y));
		
		while(!Q.isEmpty()) {
			Point tmp = Q.poll();
			
			for(int i=0; i<dx.length; i++) {
				
				int nx = tmp.x + dx[i];
				int ny = tmp.y + dy[i];
				
				
				if(nx>=0 && nx<maps.length && ny>=0 && ny<maps[0].length) {
					
					if(maps[nx][ny] ==1) {
						Q.offer(new Point(nx, ny));
						dis[nx][ny] = dis[tmp.x][tmp.y] +1;
					}
				}
			}
		}
	}
	
	
	public int solution(int[][] maps) {
        
        
        int[][] dis = new int[maps.length][maps[0].length];
        
        DFS(0,0, maps, dis);
        
        
        if(dis[6][6] == 0) {
            return -1;
        }else {
            return dis[6][6];
        }
    }
	
	
	
	
	public static void main(String[] args) {
		
		게임_맵_최단거리 T = new 게임_맵_최단거리();
		Scanner scn = new Scanner(System.in);
		
		int[][] maps = new int[][] {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}};
		int answer = T.solution(maps);
		System.out.println(answer);
	}
}
