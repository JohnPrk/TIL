package 인프런;

import java.util.*;
public class 인프런_버블_정렬 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		int[] array = new int[num];
		for(int i =0; i < num; i++) {
			array[i] = scn.nextInt();
		}
		for(int i=array.length-1;i >=1; i--) {
			for(int j=1; j <= i; j++) {
				if(array[j-1] >array[j]) {
					int tmp = array[j-1];
					array[j-1] = array[j];
					array[j] = tmp;
				}
			}
		}
		for(int i=0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
}
