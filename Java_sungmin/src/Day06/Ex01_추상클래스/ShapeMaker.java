package Day06.Ex01_추상클래스;

import java.util.Scanner;

public class ShapeMaker {
	
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 double width = 0.0;
		 double height = 0.0;
		 double radius = 0.0;
		 
		 Shape[] shapeList = new Shape[3];
		 int index = 0;
		 
		 while (true) {
			if( index == 3 )
				break;
			
			System.out.println("1. 삼각형, 2. 사각형, 3. 원형");
			System.out.print(">>");
			String input = sc.next();
			
			if (input.equals("그만"))
			    break;
		 
			switch (input) {
				case "1": 
					System.out.print("가로 : ");
					width = sc.nextDouble();
					System.out.print("세로 : ");
					width = sc.nextDouble();
					shapeList[index++] = new Triangle(width, height);
					break;
		//			사각형
				case "2":
					System.out.print("가로 : ");
					width = sc.nextDouble();
					System.out.print("세로 : ");
					width = sc.nextDouble();
					shapeList[index++] = new Rectangle(width, height);
					break;
					
				case "3":
					System.out.print("반지름 : ");
					radius = sc.nextDouble();
					shapeList[index++] = new Circle(radius);
					break;
			}
		 }
		
		double areaSum = 0.0;
		double roundSum = 0.0;
		
		for (Shape shape : shapeList) {
			if( shape == null )
				continue;
			
			double area = shape.area();
			double round = shape.round();
			
			areaSum += area;
			roundSum += round;
			
			if( shape instanceof Triangle ) System.out.println("삼각형");
			if( shape instanceof Rectangle ) System.out.println("사각형");
			if( shape instanceof Circle ) System.out.println("원형");
			
			System.out.println("넓이 총합 : " + areaSum);
			System.out.println("둘레 총합 : " + roundSum);
			sc.close();
		}
		
	}
}