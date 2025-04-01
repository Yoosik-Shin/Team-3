package Day07.Builder;

public class Builder {

	public static void main(String[] args) {
		Pikachu pikachu = new Pikachu.Builder(50, "불", 10) // 매개변수 생성자에 들어감!
									 .energy(100) // 요 밑에 얘네는 각각 따로 만들어진 애들한테 들어가서 반환됨
									 .type("전기")
									 .level(10)
									 .build();
		System.out.println(pikachu);
		
		Pikachu pikachu2 = new Pikachu.Builder()
									  .energy(200)
									  .build();
		System.out.println(pikachu2);
						  
	}
	
}
