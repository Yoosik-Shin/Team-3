package Day07_0318.Ex02_Builder;

public class Test01 {
	public static void main(String[] args) {

		// 사용 예시
		Computer.Builder builder = new Computer.Builder();
		builder = builder.cpu("Intel i7");
		builder = builder.ram("16GB");
		builder = builder.storage("512GB SSD");

		Computer computer = builder.build();
		System.out.println(computer);
	}

}

class Computer {

	private String cpu;
	private String ram;
	private String storage;

	private Computer(Builder builder) {
		this.cpu     = builder.cpu;
		this.ram     = builder.ram;
		this.storage = builder.storage;
	}

	@Override
	public String toString() {
		return "Computer [cpu=" + cpu + ", ram=" + ram + ", storage=" + storage + "]";
	}

	public static class Builder {
		private String cpu;
		private String ram;
		private String storage;

		public Computer build() {
			return new Computer(this);
		}

		public Builder cpu(String cpu) {
			this.cpu = cpu;
			return this;
		}

		public Builder ram(String ram) {
			this.ram = ram;
			return this;
		}

		public Builder storage(String storage) {
			this.storage = storage;
			return this;
		}
	}
}