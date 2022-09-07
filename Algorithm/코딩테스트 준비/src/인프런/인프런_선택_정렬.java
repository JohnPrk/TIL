package 인프런;
import java.util.*;
public class 인프런_선택_정렬 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		int[] array = new int[num];
		for(int i=0; i < num; i++) {
			array[i] = scn.nextInt();
		}
		
		for(int i=0; i < num; i++) {
			int min = array[i];
			int idx = i;
			for(int j= i+1; j < num; j++) {
				if(min > array[j]) {
					min = array[j];
					idx = j;
				}
			}
			int tmp = array[i];
			array[i] = array[idx];
			array[idx] = tmp;
			System.out.print(min + " ");
		}
	}
}
