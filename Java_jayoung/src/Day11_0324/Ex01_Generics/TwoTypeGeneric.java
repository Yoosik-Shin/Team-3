package Day11_0324.Ex01_Generics;

// 제네릭 기법으로 타입 매개변수 2개 지정
class KeyValue<K, V> {

	private K key;
	private V value;

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}
}

public class TwoTypeGeneric {

	public static void main(String[] args) {
		// 제네릭 객체 생성
		// 클래스타입<타입1, 타입2> 객체명 = new 클래스<타입1, 타입2>();
		// - 객체 생성하는 클래스명 뒤의 타입은 생략가능
		// - new 클래스<>();

		KeyValue<String, Integer> kv1 = new KeyValue<String, Integer>();
		// KeyValue<String, Integer> kv1 = new KeyValue<>();
		kv1.setKey("Java");
		kv1.setValue(100);

		// 대입절의 <>는 생략가능
		KeyValue<Integer, String> kv2 = new KeyValue();
		kv2.setKey(1002);
		kv2.setValue("Java2");

		System.out.println("kv1 - key\t: " + kv1.getKey());
		System.out.println("kv1 - value\t: " + kv1.getValue());
		System.out.println("kv2 - key\t: " + kv2.getKey());
		System.out.println("kv2 - key\t: " + kv2.getValue());

		// K 타입만 지정하고, V타입은 지정하지 않는 방법
		// Void : 해당 타입에는 병수를 사용하지 않도록 지정

		KeyValue<String, Void> kv3 = new KeyValue<>();
		kv3.setKey("key만 지정");
		// kv3.setValue(100);
		System.out.println("key3\t\t: " + kv3.getKey());
	}
}
