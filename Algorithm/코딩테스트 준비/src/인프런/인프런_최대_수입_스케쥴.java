package 인프런;
import java.util.*;
class Lecture {
	int fee, day;
	public Lecture(int fee, int day) {
		this.fee = fee;
		this.day = day;
	}
}
public class 인프런_최대_수입_스케쥴 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		ArrayList<Lecture> list = new ArrayList<>();
		while(num-- > 0) {
			list.add(new Lecture(scn.nextInt(), scn.nextInt()));
		}
	}
}
