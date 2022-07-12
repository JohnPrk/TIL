package 백준;

import java.util. *;

public class 골드_DFS_1759 {
	
	static int cnt;
	static int str_cnt;
	static String[] str_arr;
	static String[] ch;
	
	
	public void DFS(int D) {
		
		if(D == str_cnt) {
			
			String answer= "";
			int tmp_moum_cnt=0;
			
			
			for(int i =0; i < ch.length; i++) {
				if(ch[i].equals("a") || ch[i].equals("e") || ch[i].equals("i") || ch[i].equals("o") || ch[i].equals("u")) {
					tmp_moum_cnt ++;
				}
				answer += ch[i];
			}
			int tmp_jaum_cnt = Math.abs(cnt - tmp_moum_cnt);
			
			
			
			
			
			if(answer.length() == cnt && tmp_moum_cnt >=1 && tmp_jaum_cnt >= 2) {
				
				System.out.println(answer);
			}
			
			
		}else {
			
			
			ch[D] = str_arr[D];
			DFS(D+1);
			
			
			ch[D] = "";
			DFS(D+1);
		}
	}
	
	public void solution() {
		
		
		Arrays.sort(str_arr);
		
		
			DFS(0);
		
	}
	
	public static void main(String[] args) {
		
		골드_DFS_1759 T = new 골드_DFS_1759();
		
		Scanner scn = new Scanner(System.in);
	
		cnt = scn.nextInt();
		str_cnt = scn.nextInt();
		
		str_arr = new String[str_cnt];
		ch = new String[str_cnt];
		
		for(int i=0; i < str_cnt; i++) {
			str_arr[i] = scn.next();
		}
	
		
		T.solution();
		
		
	}
}
