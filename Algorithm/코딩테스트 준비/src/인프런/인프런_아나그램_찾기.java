package 인프런;
import java.util.*;
public class 인프런_아나그램_찾기 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		String ana = scn.next();
		int answer = 0;
		HashMap<String, Integer> hash = new HashMap<>();
		int p1 = 0;
		int p2 = ana.length()-1;
		HashMap<String, Integer> str_hash = new HashMap<>(); 
		HashMap<String, Integer> ana_hash = new HashMap<>();
		for(int i=0; i < ana.length(); i++) {
			ana_hash.put(String.valueOf(ana.charAt(i)), ana_hash.getOrDefault(String.valueOf(ana.charAt(i)), 0) +1);
		}
		for(int i= p1; i < p2; i++) {
			str_hash.put(String.valueOf(str.charAt(i)), str_hash.getOrDefault(String.valueOf(str.charAt(i)), 0) +1);
		}
		
		
		while(p2 < str.length()) {
			str_hash.put(String.valueOf(str.charAt(p2)), str_hash.getOrDefault(String.valueOf(str.charAt(p2)), 0) +1);
			
			if(str_hash.equals(ana_hash)) {
				answer++;
				str_hash.put(String.valueOf(str.charAt(p1)), str_hash.get(String.valueOf(str.charAt(p1))) -1);
				p1++;
				p2++;
			}else {
				str_hash.put(String.valueOf(str.charAt(p1)), str_hash.get(String.valueOf(str.charAt(p1))) -1);
				if(str_hash.get(String.valueOf(str.charAt(p1))) == 0) {
					str_hash.remove(String.valueOf(str.charAt(p1)));
				}
				p1++;
				p2++;
			}
		}
		System.out.println(answer);
	}
}
