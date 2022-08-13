package 백준;
import java.util.*;
import java.io.*;
	
public class 스택_실버_9012 {
	
	static StringBuilder sb;
	
	public void check_VPS(String PS) {
		Stack<Character> stack = new Stack<>();
		
		for(int i=0; i < PS.length(); i++) {
			char tmp = PS.charAt(i);
			if(tmp == '(') {
				stack.push(tmp);
			}else {
				if(stack.size() == 0) {
					stack.push(tmp);
					break;
				}else {
					stack.pop();
				}
			}
			
		}
//		System.out.println(stack);
		if(stack.isEmpty()) {
			sb.append("YES\n");
		}else {
			sb.append("NO\n");
		}
	}
	public static void main(String[] args) throws IOException {
		
		스택_실버_9012 T = new 스택_실버_9012();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		sb = new StringBuilder();
	
		
		
		int num = Integer.parseInt(br.readLine());
		
		for(int i=0; i < num; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String PS = st.nextToken();
			T.check_VPS(PS);
		}
		
		System.out.println(sb);
	}
}
