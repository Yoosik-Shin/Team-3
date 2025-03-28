package Day13.Ex02_Stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class LottoArrayList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 게임 : ");
		int N = sc.nextInt();
		
		for (int i = 0; i < N; i++) {
			System.out.print("[" + (i+1) + "게임] : ");
			ArrayList<Integer> lottoList = new ArrayList<Integer>();
			
			for (int j = 0; j < 6; j++) {
				int rand = (int) (Math.random()*45 +1);
				
				// 중복 제거
				if(lottoList.contains(rand)) j--;
				else lottoList.add(rand);
			}
			// 정렬
			Collections.sort(lottoList);
			
			// 출력
			for (Integer lotto : lottoList) {
				System.out.print(lotto + " ");
			}
			System.out.println();
		}
		sc.close();
		
		
		
		
//		for (int i = 0; i < N; i++) {
//			System.out.print("[" + (i+1) + "게임] : ");
//			// 랜덤 수 6개를 대입
//			for (int j = 0; j < 5; j++) {
//				lottoList.add( (int) (Math.random()*45) + 1); // 1~45랜덤 수
//				// 중복 제거
//				for (int k = 0; k < j; k++) {
//					// 현재 뽑은 랜덤 수가, 기존 수들과 같으면 다시 뽑는다.
//					if (lottoList.get(i) == lotto[k]) {
//						j--;
//						break;
//					}
//				}
//			}
//		}
		
	}
	
}
