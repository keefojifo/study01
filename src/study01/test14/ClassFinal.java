package study01.test14;

//final //상속을 못받도록 final class 예를 들어서 final String
class End{
	final void test() { // 오버라이딩 하지 못하도록 메소들를 final 로 선언한다
		System.out.println("난 end's test 메소드");
	}
}

public class ClassFinal extends End {
	static final String STR_EXAM = "Abc";
	/*
	 * void test() { System.out.println("난 Start's test 메소드");
	 */ // 사용 못한다 왜냐하면 위에 final 로 메소드 지정을 하였기 때문이다.
	
	
	
	public static void main(String[] args) {
		// Start.STR_EXAM = "123"; // final 상수로 지정 하였기 때문에 재지정 할 수 없다.
 	}
}
