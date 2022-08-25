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
		
		
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int j = sc.nextInt();
		
		Basket bk = new Basket(0, M);
		 
		int answer = 0;
		for(int i=0; i < j; i++) {
			int apple = sc.nextInt();
			
			if(apple > bk.right) {
				answer += (apple-bk.right);
				bk = new Basket(apple-M, apple);
			}else if(apple <= bk.left) {
				answer += (bk.left-apple+1);
				bk = new Basket(apple-1, apple-1+M);
			}
		}
		
		System.out.println(answer);
	}
}
