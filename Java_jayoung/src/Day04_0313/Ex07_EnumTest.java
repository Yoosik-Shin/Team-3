package Day04_0313;

enum GameLevel {
	A(1, "AA"), B(2, "BB"), C(3, "CC");

	GameLevel(int intA, String strB) {
		this.intA = intA;
		this.strB = strB;
	}

	private int    intA;
	private String strB;

	public int getIntA() {
		return intA;
	}

	public String getStrA() {
		return strB;
	}

	public boolean equalsA(int intA) {
		return this.intA == intA;
	}

	public boolean equalsB(String strB) {
		return this.strB.equals(strB);
	}

	@Override
	public String toString() {
		return "[intA : " + intA + "], [strB : " + strB + "]";
	}

}

public class Ex07_EnumTest {

	public static void main(String[] args) {
		System.out.println(GameLevel.A.getIntA());
		System.out.println(GameLevel.B.getIntA());
		System.out.println(GameLevel.C.getIntA());
		System.out.println();

		System.out.println(GameLevel.A.getStrA());
		System.out.println(GameLevel.B.getStrA());
		System.out.println(GameLevel.C.getStrA());
		System.out.println();

		System.out.println(GameLevel.A.equalsA(1));
		System.out.println(GameLevel.A.equalsA(2));
		System.out.println();

		System.out.println(GameLevel.A.equalsB("AA"));
		System.out.println(GameLevel.A.equalsB("BB"));
		System.out.println();

		System.out.println(GameLevel.A.equals(GameLevel.A));
		System.out.println(GameLevel.A.equals(GameLevel.B));
		System.out.println();

		/*
		 * enum이 제공하는 메소드
		 * valuse()
		 * toString()
		 * valusOf()
		 */
		GameLevel arrGL[] = GameLevel.values();
		for (GameLevel gl : arrGL) {
			System.out.println(gl.toString());
		}
		System.out.println();

		GameLevel gameLevel2 = GameLevel.valueOf("A");

		System.out.println(gameLevel2);
		System.out.println(gameLevel2.getIntA());
		System.out.println(gameLevel2.getStrA());

	}
}
