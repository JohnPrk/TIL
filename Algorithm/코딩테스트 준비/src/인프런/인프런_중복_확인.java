package 인프런;

import java.util.*;
public class 인프런_중복_확인 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		HashMap<Integer, Integer> hash = new HashMap<>();
		int num = scn.nextInt();
		String answer = "U";
		while(num-- >0) {
			int tmp = scn.nextInt();
			hash.put(tmp, hash.getOrDefault(tmp, 0)+1);
			if(hash.get(tmp) > 1) {
				answer = "D";
				break;
			}
		}
		System.out.println(answer);
	}
}
