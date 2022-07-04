package 프로그래머스;

public class 직사각형_별_찍기 {
	public void solution(int n, int m) {
        for(int i = 0 ; i < m ; i ++) {
            for(int j =0 ; j < n ; j++) {
                System.out.print("*");    
            }
            System.out.println();
        }
    }
}
