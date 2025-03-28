package Day03_0312;

public class Ex10_WhileSum {

	public static void main(String[] args) {

		// 1부터 1000 까지의 합계를 구하시오
		int a   = 1;
		int sum = 0;

		while (a <= 1000) {
			sum += a;
			a++;
		}
		System.out.println("합계 : " + sum);

		a   = 1;
		sum = 0;

		while (a <= 1000) {
			// sum = sum + a++;
			sum += a++;
		}
		System.out.println("합계 : " + sum);
	}
}
