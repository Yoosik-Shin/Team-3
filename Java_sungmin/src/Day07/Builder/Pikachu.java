package Day07.Builder;
/**
 * 빌더 패턴
 * : 복잡한 객체를 단계적으로 구성할 수 있도록 해주는 디자인 패턴
 */

public class Pikachu {
	
//	변수
	private int energy;
	private String type;
	private int level;
	
//	private 생성자
	public Pikachu(Builder builder) {
		this.energy = builder.energy;
		this.type = builder.type;
		this.level = builder.level;
	}
	
//	Builder 클래스를 static 클래스로 정의
	public static class Builder {
		private int energy;
		private String type;
		private int level;
		
//		pr
		public Builder() {
			this(100, "",1);
		}
		
	
	public Builder(int energy, String type, int level) {
		this.energy = energy;
		this.type = type;
		this.level = level;
	}
	
		

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
	
	public Pikachu build() {
		return new Pikachu(this);
	}
	}

	@Override
	public String toString() {
		return "Pikachu [energy=" + energy + ", type=" + type + ", level=" + level + "]";
	}

}
