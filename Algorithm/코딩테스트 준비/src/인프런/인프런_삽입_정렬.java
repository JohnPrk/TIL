package 인프런;
import java.util.*;

public class 인프런_삽입_정렬 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		int num = scn.nextInt();
		while(num-- >0) {
			int tmp = scn.nextInt();
			if(list.size()==0) list.add(tmp);
			else {
				int cnt = 0;
				for(int i=0; i < list.size(); i++) {
					if(list.get(i) > tmp) {
						list.add(i, tmp);
						cnt++;
						break;
					}
				}
				if(cnt==0) list.add(tmp);
			}
		}
		for(int l : list) System.out.println(l + " ");
	}
}
