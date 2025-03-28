package mission.Q16_추상클래스_도형;

import java.util.ArrayList;
import java.util.Scanner;

// - 1. 삼각형, 2. 사각형, 3. 원형 으로 각 도형의 종류를 선택하시오.
// - 선택된 도형에 따라 필요한 변수를 입력 받아 객체를 생성하시오.
// - 여러 개의 도형 객체를 입력 받아, 리스트에 추가하시오.
// - "그만"을 입력하면, 리스트에 존재하는 도형들의 둘레와 넓이를 출력하시오.
// - 마지막으로, 도형들의 둘레 총합과 넓이 총합을 출력하시오.
public class ShapeMaker {
	public static void main(String[] args) {

		ArrayList<Shape> shapeList = new ArrayList<Shape>();

		try (Scanner sc = new Scanner(System.in)) {

			String shapeSelect;

			while (true) {
				shapeSelect = sc.nextLine();

				if ("그만".equals(shapeSelect)) {
					break;  // "그만"을 입력하면 루프 종료
				}
				switch (shapeSelect) {
				case "삼각형":
					System.out.print("가로 : ");
					double widthT = sc.nextDouble();
					System.out.print("높이 : ");
					double heightT = sc.nextDouble();
					Shape triangle = new Triangle(widthT, heightT);
					shapeList.add(triangle);
					break;
				case "사각형":
					System.out.print("가로 : ");
					double widthR = sc.nextDouble();
					System.out.print("높이 : ");
					double heightR = sc.nextDouble();
					Shape rectangle = new Rectangle(widthR, heightR);
					shapeList.add(rectangle);
					break;
				case "원형":
					System.out.print("반지름 : ");
					double radius = sc.nextDouble();
					Shape circle = new Circle(radius);
					shapeList.add(circle);
					break;

				default:
					System.out.println("잘못된 입력입니다.");
					break;
				}

				// 비우기
				sc.nextLine();
			} // End while
		}

		// 리스트에 존재하는 도형들의 둘레와 넓이 구하기
		// double sumArea = shapeList.stream().mapToDouble(Shape::area).sum();
		// double sumRound = shapeList.stream().mapToDouble(Shape::round).sum();
		
		System.out.println("--- 도형들의 넓이와 둘레 ---");

		double sumArea  = 0.0;
		double sumRound = 0.0;

		for (Shape shape : shapeList) {
			System.out.println("넓이 : " + shape.area() + ",\t둘레 : " + shape.round());
			sumArea  += shape.area();
			sumRound += shape.round();
		}

		// 도형들의 넓이 총합과 둘레 총합 출력
		System.out.println("\n넓이 총합: " + sumArea);
		System.out.println("둘레 총합: " + sumRound);

	}

}
