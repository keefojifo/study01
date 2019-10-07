package study01.test08;

class Animal{
	
}

class Dog extends Animal{
	public void test() {
		System.out.println("난 도그의 테스트 매소드야!");
	}
	
}


public class Jindo extends Dog { //하나의 클래스에 하나 받에 상속 받을 수 없다.엄마 아빠 둘다 상속 박을 수 없고, 둘중 하나 다중 상속 불가
	
	public static void main(String[] agrs) {
		Object o1 = new Jindo(); //아무것도 상속 받지 않는 class 도 object를 상속 받고 있다.
		Object o2 = new Animal();
		Object o3 = new Dog();
		Animal a1 = new Jindo();
		// a1.test(); 오류 난다.
		Animal a2 = new Dog();
		Dog d = new Jindo();
		d.test();
		Jindo j = new Jindo();
		j.test();
		
	}
	
}
