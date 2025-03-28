package Day07_0318.Ex02_Builder;

public class Builder {
	public static void main(String[] args) {
		Pikachu pikachu = new Pikachu.Builder().energy(100)
												.type("전기")
												.level(10)
												.build();
		System.out.println(pikachu);

		Pikachu pikachu2 = new Pikachu.Builder().energy(200)
												.build();
		System.out.println(pikachu2);
	}
}
