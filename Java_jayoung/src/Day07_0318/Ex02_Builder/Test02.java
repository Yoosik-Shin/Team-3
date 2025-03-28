package Day07_0318.Ex02_Builder;

public class Test02 {
	public static void main(String[] args) {

		// 사용 예시
		Builder1 builder = new Builder1();
		builder = builder.cpu("Intel i7");
		builder = builder.ram("16GB");
		builder = builder.storage("512GB SSD");

		Computer1 computer = builder.build();
		System.out.println(computer);
	}

}

class Computer1 {

	private String cpu;
	private String ram;
	private String storage;

	Computer1(Builder1 builder) {
		this.cpu     = builder.getCpu();
		this.ram     = builder.getRam();
		this.storage = builder.getStorage();
	}

	@Override
	public String toString() {
		return "Computer [cpu=" + cpu + "\n ram=" + ram + "\n storage=" + storage + "]";
	}

}

class Builder1 {

	public String cpu;
	public String ram;
	public String storage;

	public Computer1 build() {
		return new Computer1(this);
	}

	public Builder1 cpu(String cpu) {
		this.cpu = cpu;
		return this;
	}

	public Builder1 ram(String ram) {
		this.ram = ram;
		return this;
	}

	public Builder1 storage(String storage) {
		this.storage = storage;
		return this;
	}

	public String getCpu() {
		return cpu;
	}

	public String getRam() {
		return ram;
	}

	public String getStorage() {
		return storage;
	}

}