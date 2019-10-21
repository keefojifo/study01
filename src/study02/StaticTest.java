package study02;

public class StaticTest {

	final static int a;
	static {
		a =10;
	}
	
	public static void main(String[] args) { // free loding 미리 메모리를 넣고, lazy loding 실행할때 메모리를 불러옴
		System.out.println(StaticTest.a);
		System.out.println(a);
	}
}
