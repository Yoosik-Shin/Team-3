package Day02;

import java.util.Scanner;

public class Ex08_Triangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("삼각형의 넓이");
		System.out.print("밑변 : ");
		double width = sc.nextDouble();
		
		System.out.print("높이 : ");
		double height = sc.nextDouble();
		
		//삼각형의 넓이 구하는 공식
		// (넓이) = (밑변) * (높이) / 2
		double area = width * height / 2;
		System.out.println("넓이 : " + area);
		sc.close();
	}
}

// 증감연산자 ++와 --는 전위에 있으면 최우선순위계산 후위에있으면 맨나중계산
