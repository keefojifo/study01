package test06;

public class MethodTest {
	public static void main(String[] args) {
		String str = "123"; // 정해지지 않은 데이터 타입을 쓰려면 new (string은 new를 안써도되 너무 많이 사용하니까 생략 가능)
		String str1 = new String("123");
		System.out.println("123" == "123"); // true
		System.out.println(str == "123"); // true
		System.out.println(str1 == "123"); // false
		System.out.println(str == str1); // false
		// ==은 값을 비교하는 것이 아니다. 저장하고 있는 메모리 위치가 같은지를 확인하는
		System.out.println(str.hashCode());

		// 암호학,

		System.out.println(str.contentEquals(str1)); // 값을 비교 하는

		int a = 123; // 앞에 new 가 없으므로 같은 영역에 저장이 된다. 즉 자바 영역에 저장된다
		int b = 123; // new를 쓸 수 없다.
		System.out.println(123 == a);
		System.out.println(123 == b);
		System.out.println(a == b);
	}
}
