package Day07_0318.Ex02_Builder;

public class Pikachu {

	// 변수
	private int    energy;
	private String type;
	private int    level;

	// private 생성자
	public Pikachu(Builder builder) {
		this.energy = builder.energy;
		this.type   = builder.type;
		this.level  = builder.level;
	}

	@Override
	public String toString() {
		return "Picachu [energy=" + energy + ", type=" + type + ", level=" + level + "]";
	}

	// Builder 클래스를 static 이너 클래스로 정의
	public static class Builder {

		private int    energy;
		private String type;
		private int    level;

		public Builder() {
			this(100, "", 1);
		}

		public Builder(int energy, String type, int level) {
			this.energy = energy;
			this.type   = type;
			this.level  = level;
		}

		// 각 변수를 초기화하고, 인스턴스를 반환하는 메소드를 정의
		public Builder energy(int energy) {
			this.energy = energy;
			return this;
		}

		public Builder type(String type) {
			this.type = type;
			return this;
		}

		public Builder level(int level) {
			this.level = level;
			return this;
		}

		// 객체를 생성해주는 메소드
		public Pikachu build() {
			return new Pikachu(this);
		}
	}
}
