package Day02;

public class Ex03_Byte {
	public static void main(String[] args) {
		// byte 는 1byte 범위의 정수 데이터를 표현
		// 1byte = 8bits        (0000 0000) : 2^8 : 256개
		// 양수와 음수로 나누면, -? ~ ? 범위로 표현 가능
		
		byte var1 = -128;
		byte var2 = -30;
		byte var3 = 0;
		byte var4 = 30;
		byte var5 = (byte) 128;     // 127까진데 128이라 에러남?? 
		byte var6 = (byte) 130;     // 걍 127로 고쳤었는데 강제형변환 써보라는거였음...
		                            // 강제형변환 사용하면 표현은 되지만 -128이 되버림
		                            // 데이터 범위를 벗어났기때문에, -128 ~ 127까지 표현가능인데
		                            // 127에서 1이 넘어가버려서 한바퀴 돌아 -128이됨?!
		                            // var6을 하나 더 만들어서 실행해본 결과
		                            // 값이 넘어가면 원을 도는 방식으로 표현함을 확인
		// (에러)
		// - 에러 메시지 : Type mismatch
		// → 자료형(타입)이 불일치, 데이터 범위 벗어남(overflow)
		
		System.out.println("var1 : " + var1);
		System.out.println("var2 : " + var2);
		System.out.println("var3 : " + var3);
		System.out.println("var4 : " + var4);
		System.out.println("var5 : " + var5);
		System.out.println("var6 : " + var6);
	}
}
