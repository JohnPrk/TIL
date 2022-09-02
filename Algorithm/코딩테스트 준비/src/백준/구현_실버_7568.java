package 백준;

import java.util.*;
class Person {
	int weight, height;
	
	public Person(int weight, int height) {
		this.weight = weight;
		this.height = height;
	}
}
public class 구현_실버_7568 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		ArrayList<Person> list = new ArrayList<>();
		int cnt = scn.nextInt();
		int[] ans = new int[cnt];
		String answer = "";
		while(cnt-- > 0) list.add(new Person(scn.nextInt(), scn.nextInt()));
	
		for(int i=0; i < list.size(); i++) {
			int rank =1;
			for(int j= 0; j<list.size(); j++) {
				if(list.get(i).weight < list.get(j).weight && list.get(i).height < list.get(j).height) rank++;
			}
			answer += rank + " ";
		}
		answer = answer.trim();
		System.out.println(answer);
	}
}