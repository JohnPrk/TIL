package 백준;
import java.util.*;
public class 수학_브론즈_2501 {
	public static void main(String[] args) {
        int answer = 0;
		Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        int per = scn.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1; i <= number; i++) if(number%i==0) list.add(i);
        if(list.size() < per) answer = 0; 
        else answer = list.get(per-1);
        System.out.println(answer);
    }
}
