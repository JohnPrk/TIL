package 인프런;
import java.util.*;
public class 인프런_학급_회장 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String answer = "";
		int ans = 0;
		HashMap<String, Integer> hash = new HashMap<>();
		hash.put("A", 0);
		hash.put("B", 0);
		hash.put("C", 0);
		hash.put("D", 0);
		hash.put("E", 0);
		int num = scn.nextInt();
		String[] str_array = scn.next().split("");
		for(String s : str_array) {
			if(s.equals("A")) hash.put("A", hash.get("A") + 1);
			else if(s.equals("A")) hash.put("A", hash.get("A") + 1);
			else if(s.equals("B")) hash.put("B", hash.get("B") + 1);
			else if(s.equals("C")) hash.put("C", hash.get("C") + 1);
			else if(s.equals("D")) hash.put("D", hash.get("D") + 1);
			else if(s.equals("E")) hash.put("E", hash.get("E") + 1);
		}
		for(String s :hash.keySet()) {
			if(hash.get(s) > ans) {
				ans = hash.get(s);
				answer = s;
			} 
		}
		System.out.println(answer);
	}
}
