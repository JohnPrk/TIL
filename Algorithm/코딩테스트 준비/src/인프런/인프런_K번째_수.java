package 인프런;
import java.util.*;
public class 인프런_K번째_수 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		TreeSet<Integer> tree = new TreeSet<>(Collections.reverseOrder());
		int num = scn.nextInt();
		int count = scn.nextInt();
		int[] numbers = new int[num];
		int answer =-1;
		int cnt =0;
		for(int i=0; i < num; i++) {
			numbers[i] = scn.nextInt();
		}
		
		for(int i =0; i < num; i++) {
			for(int j=i+1; j < num; j++) {
				for(int k=j+1; k < num; k++) {
					tree.add(numbers[i] + numbers[j] + numbers[k]);
				}
			}
		}
		for(int t : tree) {
			if(++cnt == count) answer = t;
		}
		System.out.println(answer);
	}
}
