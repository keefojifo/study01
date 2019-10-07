package study01.test08;
//생성자 연습
//생성자는 overriding이 안된다.
//시험문제
class Father{
	int a;
	Father(){
		System.out.println("1.난 아빠 클래스의 생성자임!");
	}
}

public class Constructor extends Father { //대표하는 클레스는 constructor 라고 알수 있다. 누가 보더라고 퍼블릭은 constructor 라고 알려주는거
	Constructor(){
		System.out.println("2.난 생성자 클래스의  생성자임!");
	}
		

public static void main(String[] agrs) {
	Constructor c = new Constructor();
}
}
