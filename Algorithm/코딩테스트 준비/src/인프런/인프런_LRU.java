package 인프런;

import java.util.*;
public class 인프런_LRU {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int size = scn.nextInt();
		int numbers = scn.nextInt();
		int[] cache = new int[size];
		
		for(int i=0; i < numbers; i++) {
			int number = scn.nextInt();
			int idx = -1;
			for(int j=0; j < size; j++) {
				if(number == cache[j]) {
					idx = j;
				}
			}
			if(idx == -1) {
				for(int k=size-1; k >= 1; k--) {
					cache[k] = cache[k-1];
				}
				cache[0] = number;
			}else {
				for(int l=idx ; l>=1; l--) {
					cache[l] = cache[l-1];
				}
				cache[0] = number;
			}
		}
		for(int i=0; i < cache.length; i++) {
			System.out.print(cache[i] + " ");
		}
	}
}
