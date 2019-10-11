package study01.test10;

public class Instanceof {
	
   class Father{
	   
   }
	
	public class Son extends Father{
	
	}
	
	public void test() {
		System.out.println("난 아들 테스트");
		
	}
	public void sonsTest() {
		System.out.println("난 아빠한테는 없는 기능이 있음");
	}
	
	public static void main(String[] args) {
		Father s = new Son();
		
		Son s2 = (Son)s;
		s2.sonsTest();
		
		Father f = new Father();
		if(f instanceof Son) {
			s2 = (Son)f;
			s2.sonsTest();
		}
	}

}
