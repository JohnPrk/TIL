package 프로그래머스;

import java.util.*;

public class 카카오프렌즈_컬러링_북 {

	 static int cnt;
	 
	 public void DFS(int x, int y, int m, int n, int temp_number, int[][] picture) {
	        
	        int[] dx = {0,1,0,-1};
	        int[] dy = {1,0,-1,0};
	        
	        if(picture[x][y] == 0 || picture[x][y] == 10) {
	            return;
	        }
	    
	        picture[x][y] = 10;
	        cnt ++;
	        
	        for(int i=0; i < dx.length; i++) {
	            
	            int nx = x + dx[i];
	            int ny = y + dy[i];
	        
	            if(nx >= 0 && nx < m && ny >=0 && ny < n) {        
	                if(picture[nx][ny] == temp_number) {
	                    
	                    DFS(nx, ny, m, n, temp_number, picture);
	                }
	            }
	        }
	    }
	    
	    public int[] solution(int m, int n, int[][] picture) {
	        int numberOfArea = 0;
	        int maxSizeOfOneArea = Integer.MIN_VALUE;
	        int tmp =0;
	        int[][] pp = picture.clone();
	        cnt =0;
	        

	        
	        for(int i=0; i < pp.length; i++) {
	            for(int j=0; j< pp[0].length; j++) {
	                
	                if(pp[i][j] != 0 && pp[i][j] != 10) {    
	                    cnt = 0;
	                    tmp = pp[i][j];
	                    
	                    DFS(i,j,m,n, tmp, pp);
	                    numberOfArea++;
	                    
	                    maxSizeOfOneArea = Math.max(cnt, maxSizeOfOneArea);
	                }
	            }
	        }    
	        
	        
	        int[] answer = new int[2];
	        
	        answer[0] = numberOfArea;
	        answer[1] = maxSizeOfOneArea;
	        
	        for(int ans: answer) {
	        	System.out.println(ans);
	        }
	        return answer;
	    }
	
	
	public static void main(String[] args) {
		
		카카오프렌즈_컬러링_북 T = new 카카오프렌즈_컬러링_북();
		
		int m = 13;
		int n = 16;
		int[][] picture = new int [][] {{0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0}, {0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0}, {0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0}, {0, 1, 1, 1, 1, 2, 1, 1, 1, 1, 2, 1, 1, 1, 1, 0}, {0, 1, 1, 1, 2, 1, 2, 1, 1, 2, 1, 2, 1, 1, 1, 0}, {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0}, {0, 1, 3, 3, 3, 1, 1, 1, 1, 1, 1, 3, 3, 3, 1, 0}, {0, 1, 1, 1, 1, 1, 2, 1, 1, 2, 1, 1, 1, 1, 1, 0}, {0, 0, 1, 1, 1, 1, 1, 2, 2, 1, 1, 1, 1, 1, 0, 0}, {0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0}, {0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0}};
	
		T.solution(m, n, picture);
		
		
		
		
	}
}
