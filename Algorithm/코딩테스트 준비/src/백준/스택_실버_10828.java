package 백준;
	
import java.util.*;
import java.io.*;

public class 스택_실버_10828 {
	
	public static Stack<Integer> stack;
	

	public static void main(String[] args) throws IOException {
		
		스택_실버_10828 T = new 스택_실버_10828();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Integer> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		for(int i=0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String s = st.nextToken();
			
			if(s.equals("push")) {
				stack.push(Integer.parseInt(st.nextToken()));
			}
			if(s.equals("pop")) {
				if(stack.isEmpty()) {
					sb.append(-1 + "\n");
				}else {
					sb.append(stack.pop() + "\n");
				}
			}
			if(s.equals("size")) {
				sb.append(stack.size() + "\n");
			}
			if(s.equals("empty")) {
				if(stack.isEmpty()) {
					sb.append(1 + "\n");
				}else {
					sb.append(0 + "\n");
				}
			}
			if(s.equals("top")) {
				if(stack.isEmpty()) {
					sb.append(-1 + "\n");	
				}else {
					sb.append(stack.peek() + "\n");
				}
			}
			
		
		}
		System.out.println(sb);


	}
}
