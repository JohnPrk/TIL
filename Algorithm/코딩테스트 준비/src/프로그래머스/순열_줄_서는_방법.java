package 프로그래머스;
import java.util.*;
public class 순열_줄_서는_방법 {
	static int count;
	static int[] answer;
	static void perm(int[] arr, int[] output, boolean[] visited, int depth, int n, int r, long end_point) {
        if (depth == r) {
            if(count++ == end_point) {
            	for(int i =0; i < output.length; i++) answer[i] = output[i];
            }
            return;
        }

        for (int i = 0; i < n; i++) {
            if (visited[i] != true) {
                visited[i] = true;
                output[depth] = arr[i];
                perm(arr, output, visited, depth + 1, n, r, end_point);
                visited[i] = false;
            }
        }
    }
	public static void main(String[] args) {
		int n = 3;
        int[] arr = {1, 2, 3};
        int k = 5;
        count =1;
        answer = new int[n];
        int[] output = new int[n];
        boolean[] visited = new boolean[n];

        perm(arr, output, visited, 0, n, n, k);
        for(int a : answer) {
        	System.out.println(a);
        }
        
	}
}
