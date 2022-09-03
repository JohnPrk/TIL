package 백준;
	
import java.util.*;

public class 정렬_실버_1181 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		String[] array = new String[num];
		for(int i=0; i < num; i++) {
			array[i] = scn.next();
		}
		
		Arrays.sort(array, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				if(o1.length() == o2.length()) return o1.compareTo(o2);
				return o1.length() - o2.length();
			}
		});
		System.out.println(array[0]);
		for(int i=1; i < num; i++) {
			if(!array[i].equals(array[i-1])) {
				System.out.println(array[i]);
			}
		}
	}
}
