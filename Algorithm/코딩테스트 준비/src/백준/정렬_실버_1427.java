package 백준;
import java.util.*;
public class 정렬_실버_1427 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String[] str = scn.next().split("");
		StringBuilder sb = new StringBuilder();
		Arrays.sort(str, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);
			}
		});
		for(String s : str) sb.append(s);
		System.out.println(sb);
	}
}
