package 백준;

import java.util.*;

public class 브론즈_3003 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int[] checkArray = {1,1,2,3,2,8};
		String answer = "";
		
		
		for(int i=0; i < checkArray.length; i++) {
			answer += (checkArray[i] - scn.nextInt()) + " "; 
		}
		
		
	}
}
