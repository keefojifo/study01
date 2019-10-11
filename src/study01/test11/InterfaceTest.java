package study01.test11;

interface Promise { //인터페이스를 사용하면 무조건 설계서 대로 사용해야된다.(이 설계서 대로 구현하겠다)

	void test(); //선언만으로도 가능하다.// public 선언이다.
	public void test1();
}

class Father{
	void test2() {
		
	}
}

public class InterfaceTest extends Father implements Promise{// Interface 약속, 설계서 //implements 구성하다

		public void test() { //interface를 사용하면 무조건 overriding을 해줘야 한다.//오버 라이딩은 리턴타입도 동일해야 되며 
			//오버 로딩은 리턴타입이 동일하지 안아도 된다.
			
		}
		public void test1() {
			
		}
		//protected void test2() { }// 에러
		//void test2( ) { } //에러
		public void test2() {} //됨
		
//	int test;

//	void test() {
		//자기 자신의 영역이 있어야 선언할 수 있다.
	}

