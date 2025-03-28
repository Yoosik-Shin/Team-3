package Day03;

import java.util.Scanner;

public class Ex14_Gugu {
	public static void main(String[] args) {
		
//		구구단 (1~9단)
//		원하는 단을 입력받아서 아래와 같이, 구구단 수식을 출력하시오.
//		입력 : 5
//		5*1=5
//		5*2=10
//		5*3=15
//		5*4=20
//		5*5=25
//		5*6=30
//		5*7=35
//		5*8=40
//		5*9=45
		Scanner sc = new Scanner(System.in);
		System.out.println("입력 : ");
		int input = sc.nextInt();
		
		for (int i = 0; i <= 9; i++) {
			System.out.println(input + "*" + i + "=" + (input*i));
		}
		sc.close();
		
	}

}
