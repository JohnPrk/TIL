package 백준;

import java.util.*;

class Basket {
	public int left, right;
	
	public Basket(int left, int right) {
		this.left = left;
		this.right = right;
	}
}

public class 구현_실버_2828 {
	
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int N = scn.nextInt();
		int M = scn.nextInt();
		int num = scn.nextInt();
		
		Basket bk = new Basket(0, num);
		 
		int answer = 0;
		for(int i=0; i < num; i++) {
			int apple = scn.nextInt();
			
			if(apple > bk.right) {
				answer += (apple - bk.right);
				bk = new Basket(apple-M, apple);
			}else if(apple < bk.left) {
				answer += (bk.left - apple -1);
				bk = new Basket(apple-M, apple);
			}
			
//			System.out.println(bk.left + " " + bk.right);
		}
		
		System.out.println(answer);
	
	}
}
