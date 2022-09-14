package 인프런;
import java.util.*;

class Time {
	int time;
	char status;
	
	public Time(int time, char status) {
		this.time = time;
		this.status = status;
	}
}
public class 인프런_결혼식 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		int answer = 0;
		int cnt = 0;
		ArrayList<Time> list = new ArrayList<>();
		while(num-- > 0) {
			list.add(new Time(scn.nextInt(), 's'));
			list.add(new Time(scn.nextInt(), 'e'));
		}
		Collections.sort(list, new Comparator<Time>() {
			@Override
			public int compare(Time t1, Time t2) {
				if(t1.time == t2.time) {
					return t1.status - t2.status;
				}
				return t1.time - t2.time;
			}
		});
		for(Time l : list) {
			if(l.status == 's') cnt++;
			else cnt--;
			answer = Math.max(answer, cnt);
		}
		System.out.println(answer);
	}
}