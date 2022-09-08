package 인프런;
import java.util.*;
public class 인프런_아나그램 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String answer = "YES";
		String[] s1 = scn.next().split("");
		String[] s2 = scn.next().split("");
		HashMap<String, Integer> h1 = new HashMap<>();
		HashMap<String, Integer> h2 = new HashMap<>();
		for(int i=0; i < s1.length; i++) {
			if(h1.containsKey(s1[i])) {
				h1.put(s1[i], h1.get(s1[i]) +1);
			}else {
				h1.put(s1[i], 1);
			}
		}
		for(int i=0; i < s2.length; i++) {
			if(h2.containsKey(s2[i])) {
				h2.put(s2[i], h2.get(s2[i]) +1);
			}else {
				h2.put(s2[i], 1);
			}
		}
		for(String s : h1.keySet()) {
			if(!(h1.get(s) == h2.get(s))) {
				answer = "NO";
				break;
			}
		}
		System.out.println(answer);
	}
}
