package 프로그래머스;

import java.util.*;

public class 단체사진_찍기 {

	static String[] d;
	static HashMap<Character, Integer> map;
	static boolean[] visited;
	static int[] ch;
	static int answer;
	
	public static boolean check() {
		int a, b, res;
		char op;
		
		for(String s : d) {
			a = ch[map.get(s.charAt(0))];
            b = ch[map.get(s.charAt(2))];
            op = s.charAt(3);
            res = s.charAt(4)-'0' + 1;
		
			if(op == '='){ if(Math.abs(a-b)!=res) return false;}
            else if(op == '>'){ if(Math.abs(a-b) <= res) return false;}
            else {if(Math.abs(a-b) >= res) return false;}
		}
		
		
		return true;
	}
	
	public static void DFS(int D) {
		if(D == 8) {
			if(check()) {
				answer ++;
			}
		}else {
			for(int i=0; i<8; i++) {
				if(!visited[i]) {
					visited[i] = true;
					ch[D] =i;
					DFS(D+1);
					visited[i] = false;
				}
			}
		}
	}
	
	public int solution(int n, String[] data) {
		
		int answer =0; 
		
		d = data;
        map = new HashMap<>();
        visited = new boolean[8];
        ch = new int[8];
		
        map.put('A',0);
        map.put('C',1);
        map.put('F',2);
        map.put('J',3);
        map.put('M',4);
        map.put('N',5);
        map.put('R',6);
        map.put('T',7);
        
        DFS(0);
		
		
		return answer;
		
		
	}
	
	public static void main(String[] args) {
		
		단체사진_찍기 T = new 단체사진_찍기();
		
		int n = 2;
		String[] data = new String[] {"N~F=0", "R~T>2"};
	
		T.solution(n, data);
		
		System.out.println(answer);
	}
}
