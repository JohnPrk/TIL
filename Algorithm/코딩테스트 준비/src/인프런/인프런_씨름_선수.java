package 인프런;

import java.util.*;


public class 인프런_씨름_선수 {
	
	static int max = Integer.MIN_VALUE;
	
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int cnt = 0;
		int num = scn.nextInt();
		String[] str_array = new String[num];
		
		for(int i=0; i < num; i++) {
			str_array[i] = scn.nextInt() + " " + scn.nextInt();
			
			
		}
		Arrays.sort(str_array, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				
				String h1 = o1.split(" ")[0];
				String h2 = o2.split(" ")[0];
				
				int result = h2.compareTo(h1);
						
				return result;
				
			}
		});
		
		for(String s : str_array) {
			if(max < Integer.parseInt(s.split(" ")[1])) {
				max = Integer.parseInt(s.split(" ")[1]);
				cnt ++;
			}
		}
		System.out.println(cnt);
	}
}