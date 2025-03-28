package Day04_0313;

public class Ex00_ArrayCopy {

	public static void main(String[] args) {
		int[] a = {11, 12, 13, 14, 15, 16, 17};
		int[] b = {1, 2, 3, 4, 5, 6, 7, 8, 9};

		System.arraycopy(a, 1, b, 2, 3);

		for (int i : b) {
			System.out.print(i + " ");
		}
	}
}
