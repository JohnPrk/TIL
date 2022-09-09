package 인프런;
import java.util.*;
public class 인프런_매출액의_종류 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		HashMap<Integer, Integer> hash = new HashMap<>();
		ArrayList<Integer> list = new ArrayList<>();
		int num = scn.nextInt();
		int per = scn.nextInt();
		int[] numbers = new int[num];
		for(int i=0; i < num; i++) {
			numbers[i] = scn.nextInt();
		}
		for(int i=0; i < per-1; i++) hash.put(numbers[i], hash.getOrDefault(numbers[i], 0) +1);
		int lt = 0;
		for(int rt= per-1; rt < num; rt++) {
			hash.put(numbers[rt], hash.getOrDefault(numbers[rt], 0) +1);
			list.add(hash.size());
			hash.put(numbers[lt], hash.get(numbers[lt]) -1);
			if(hash.get(numbers[lt]) == 0) hash.remove(numbers[lt]);
			lt++;
		}
		for(int l : list) {
			System.out.println(l + " ");
		}
	}
}
