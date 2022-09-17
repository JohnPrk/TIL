package 백준;
import java.util.*;
public class 그리디_골드_1700 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		HashMap<Integer, Integer> hash = new HashMap<>();
		HashSet<Integer> h = new HashSet<>();
		
		ArrayList<Integer> list = new ArrayList<>();
		int answer = 0;
		int per = scn.nextInt();
		int num = scn.nextInt();
		int[] numbers = new int[num];
		for(int i=0; i <num; i++) {
			int n = scn.nextInt();
			hash.put(n, hash.getOrDefault(n, 0)+1);
			numbers[i] = n;
		}
		for(int i=0; i <numbers.length; i++) {
			System.out.println(numbers[i]);
			System.out.println(hash);
			if(list.size() >= per) {	
				int check = hash.get(list.get(0));
				int check_index = 0;
				int cnt = 0;
				if(!list.contains(numbers[i])) {
					if(per == 1) check_index = 0;
					else {
						for(int j=1; j < list.size(); j++) {
							
							if(check >= hash.get(list.get(j))) {
								check = hash.get(list.get(j));
								check_index = j;
							}
						}
						for(int a=0; a < list.size(); a++) {
							for(int b = i; b < i+per; b++) {
								if(b < numbers.length && list.get(a)) {
									
								}
							}
						}
						for (int j = i; j < i+per; j++) {
							System.out.println(j);
//							if(j < numbers.length && !list.contains(numbers[j])) check_index = j;						
						}
					}
					System.out.println("인덱스" + check_index);
					list.remove(check_index);
					list.add(numbers[i]);
					hash.put(numbers[i], hash.get(numbers[i])-1);
					answer++;
				}else {
					hash.put(numbers[i], hash.get(numbers[i])-1);
				}
			}else {
				if(list.contains(numbers[i])) {
					hash.put(numbers[i], hash.get(numbers[i])-1);
				}else {
					hash.put(numbers[i], hash.get(numbers[i])-1);
					list.add(numbers[i]);
				}
			}
			System.out.println(hash);
			System.out.println(list);
			System.out.println(answer);
			System.out.println();
		}
//		System.out.println(answer);
	}
}
