package study01.test12;

public class Father {

	public Father() {
		System.out.println("난 아빠 생성자");
	}
}
class Test extends Father {
	
	public Test() {
		System.out.println("s난 테스트 생성자");
	}
	
	public void a() {
		System.out.println();
	}
	public static void main(String[] args) {
		Test t = new Test();
//		((Test)t).a();
	}
}

