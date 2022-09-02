package 백준;
import java.util.*;

public class 그리디_실버_1931 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int cnt = scn.nextInt();
		int[][] timeTable = new int[cnt][2];
		for(int i=0; i< cnt ;i++) {
			timeTable[i][0] = scn.nextInt();
			timeTable[i][1] = scn.nextInt();
		}
		
		Arrays.sort(timeTable, new Comparator<int[]>() {	
			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[1] == o2[1]) {
					return o1[0] - o2[0];
				}
				return o1[1] - o2[1];
			}
 
		});
		int prev_end_time =0;
		int answer =0;
		for(int i=0; i < timeTable.length; i++) {
			if(timeTable[i][0] >= prev_end_time) {
				prev_end_time = timeTable[i][1];
				answer ++;
			}
		}
		System.out.println(answer);
	}
}
