package 백준;

import java.util.*;
public class 큐_실버_10845 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		StringBuilder sb = new StringBuilder();
		LinkedList<Integer> Q = new LinkedList<>();
		
		while(num-- > 0) {
			String str_array = scn.next();
			if(str_array.equals("push")) {
				Q.add(scn.nextInt());
			}else if(str_array.equals("front")) {
				
				if(!Q.isEmpty()) {
					sb.append(Q.peek()).append("\n");
				}else {
					sb.append("-1\n");
				}
			}else if(str_array.equals("back")) {
				if(!Q.isEmpty()) {
					sb.append(Q.get(Q.size()-1)).append("\n");
				}else {
					sb.append("-1\n");
				}
			}else if(str_array.equals("empty")) {
				if(!Q.isEmpty()) {
					sb.append("0\n");
				}else {
					sb.append("1\n");
				}
			}else if(str_array.equals("size")) {
				sb.append(Q.size()).append("\n");
			}else if(str_array.equals("pop")) {
				if(!Q.isEmpty()) {
					sb.append(Q.pop()).append("\n");
				}else {
					sb.append("-1\n");
				}
			}
		}
		System.out.println(sb);
	}
}
