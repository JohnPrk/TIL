package 인프런;
import java.util.*;

public class 인프런_교육과정_설계 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Queue<String> Q = new LinkedList<>();
		String[] essential = scn.next().split("");
		int idx = 0;
		for(String e : essential) Q.add(e);
		String[] cls = scn.next().split("");
		while(!Q.isEmpty() && idx < cls.length) {
			if(Q.peek().equals(cls[idx])) {
				Q.poll();
				idx++;
			}else idx++;
		}
		if(Q.isEmpty()) System.out.println("YES");
		else System.out.println("NO");
	}
}
