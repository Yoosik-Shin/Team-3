package Day03;

import java.util.Scanner;

/** < 여까지 쓰고 엔터치면 여러줄주석 생성
 *  입력 받은 값이 홀수인지, 짝수인지 조건문으로 판단하시오.
 *  if(조건식) {  }
 *  홀수 : 1, 3, 5, 7 ...
 *  짝수 : 2, 4, 6, 8 ...
 */
public class Ex02_IfElse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		if (num % 2 == 1) {
			System.out.println("홀수 입니다.");
		}
		else {
			System.out.println("짝수 입니다.");
		}
		sc.close();
	}
}
// 아래처럼 실행문 안에 코드가 한줄정도라면 중괄호는 생략이 가능하다.
//     if (num % 2 == 1) 
//	      System.out.println("홀수 입니다.");
//
//     else 
//	      System.out.println("짝수 입니다.");
