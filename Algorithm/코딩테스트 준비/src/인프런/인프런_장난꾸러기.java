package 인프런;
import java.util.*;

public class 인프런_장난꾸러기 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		int[] numbers = new int[num];
		int[] copy = new int[num];
		for(int i=0; i < num; i++) numbers[i] = scn.nextInt();
		for(int i=0; i < num; i++) copy[i] = numbers[i];
		Arrays.sort(numbers);
		for(int i=0; i < num; i++) {
			if(numbers[i] != copy[i]) System.out.print((i+1) + " ");
		}
	}
}
