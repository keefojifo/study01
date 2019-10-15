package study01.test14;
class Son extends AbstractTest{

	@Override
	public void test() {
		// TODO Auto-generated method stub
		System.out.println("test");
	}
	
}
public abstract class AbstractTest { //추상 클래스에
	

	public abstract void test(); //추상 메소드 선언
	
	
	//자기 영역이 필요하기 때문에 클래스는 왜 자기 영역이 있어야 하는가 
    //class는 new 를 통해서 매모리를 생성할 수 있고 interface는 new를 못하기 때문에 
	
	
	public static void main(String[] args) {
		AbstractTest at = new Son();
		at.test();
	}

}
