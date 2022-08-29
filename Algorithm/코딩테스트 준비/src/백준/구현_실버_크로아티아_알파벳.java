package 백준;

import java.util.*;

public class 구현_실버_크로아티아_알파벳 {
	
	public static void main(String[] args) {
		String[] str_arrays = new String[] {"c=","c-","dz=","d-","lj","nj","s=","z="}; 
		Scanner scn = new Scanner(System.in);
		String croatia_string = scn.next();
		
		for(int i=0; i < str_arrays.length; i++) {
			if(croatia_string.contains(str_arrays[i])) croatia_string = croatia_string.replace(str_arrays[i], "!"); 
		}
		
		System.out.println(croatia_string.length());
	}
}
