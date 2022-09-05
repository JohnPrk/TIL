package 백준;
import java.util.*;
class Virus {
	int x, y;
	public Virus(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
public class BFS_골드_14502{
	static int max = Integer.MIN_VALUE;
	
	public void check_virus(int[][] board) {
		int non_virus =0;
		for(int i=0; i < board.length; i++) {
			for(int j=0; j < board[0].length; j++) {
				if(board[i][j] == 0) non_virus++;
			}
		}
		max = Math.max(max, non_virus);
	}
	
	public void BFS(int x, int y, int[][] board) {
		Queue<Virus> Q = new LinkedList<>();
		int[][] copy_board = new int[x][y];
		for(int i=0; i<x; i++) {
			for(int j=0; j<y; j++) {
				copy_board[i][j] = board[i][j];
			}
		}
		int[] dx = {1, 0, -1, 0};
		int[] dy = {0, -1, 0, 1}; 
		
		for(int i=0; i < x; i++) {
			for(int j=0; j<y; j++) {
				if(copy_board[i][j] == 2) {
					Q.offer(new Virus(i, j));
				}
			}
		}
		while(!Q.isEmpty()) {
			Virus virus = Q.poll();
			for(int i=0; i< dx.length; i++) {
				int nx = virus.x + dx[i];
				int ny = virus.y + dy[i];
				
				if(nx >=0 && nx < x && ny >=0 && ny <y) {
					if(copy_board[nx][ny] == 0) {
						copy_board[nx][ny] = 2;
						Q.offer(new Virus(nx, ny));
					}
				}
			}
		}
		check_virus(copy_board);
	}
	
	public void DFS(int x, int y, int[][] board, int depth) {
		if(depth == 3) {
			BFS(x,y,board);
			return;
		}
		for(int i=0; i<x; i++) {
			for(int j=0; j<y; j++) {
				if(board[i][j]==0) {
					board[i][j] =1;
					DFS(x,y,board,depth+1);
					board[i][j] =0;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		BFS_골드_14502 T = new BFS_골드_14502();
		int x = scn.nextInt();
		int y = scn.nextInt();
		int[][] board = new int[x][y];
		for(int i=0; i<x; i++) {
			for(int j=0; j<y; j++) {
				board[i][j] = scn.nextInt();
			}
		}
		T.DFS(x,y,board,0);
		System.out.println(max);
	}
}