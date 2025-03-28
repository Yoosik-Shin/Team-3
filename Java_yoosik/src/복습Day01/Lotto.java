package 복습Day01;

import java.util.Iterator;

public class Lotto {

	public static void main(String[] args) {
		
		int lotto[] = new int[6];
		
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = (int) ((Math.random()*45) + 1);
			for (int j = i-1; j >= 0 ; j--) {
				if (lotto[i] == lotto[j]) {
					i--;
				}
			}
		}
		
		for (int i = 0; i < lotto.length; i++) {
			for (int j = i+1; j < lotto.length; j++) {
				int temp;
				if(lotto[i] > lotto[j]) {
					temp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = temp;
				}
			}
		}
		for (int i : lotto) {
			System.out.print(i + " ");
		}
		
	}
	
}
