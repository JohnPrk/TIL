package 백준;
import java.util.*;

public class 스택_골드_17298 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		int num = scn.nextInt();
		while(num-- > 0) list.add(scn.nextInt());
		for(int i=0; i < list.size(); i++) {
			int tmp = -1;
			for(int j=i; j <list.size(); j++) {				
				if(list.get(i) < list.get(j)) {
					tmp = list.get(j);
					break;
				}
				System.out.println(tmp);
			}
		}
		
	}
}
