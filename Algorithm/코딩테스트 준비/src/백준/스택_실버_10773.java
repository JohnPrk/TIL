package 백준;

import java.util.*;
import java.io.*;

public class 스택_실버_10773 {

	
	
	
	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int answer =0;
		Stack<Integer> stack = new Stack<>();
		
		int num = Integer.parseInt(br.readLine());
		
		for(int i=0; i < num; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String s = st.nextToken();
			
			if(s.equals("0")) {
				stack.pop();
			}else {
				stack.push(Integer.parseInt(s));
			}
		}
		
		
		
		for(int s : stack) {
			answer += s;
		}
		System.out.println(answer);
	}
}
