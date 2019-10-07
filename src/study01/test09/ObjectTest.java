package study01.test09;

//static에 대하여
public class ObjectTest {

	int num1;
	private static int num2; // 이텔릭체로 나오는 것은 static 이다, 초기화를 0으로 해버린다.//

	/*public static void main(String[] args) {
		ObjectTest ot = new ObjectTest(); // num1 은 static 이 아니고 메인은 static 이다
		ot.num1 = 10;

		System.out.println(ObjectTest.num2); // num2 == 0
		num2 = 30;
		System.out.println(num2); // num2 == 3
*/
	
	public static void main(String[] args) {
		ObjectTest ot = new ObjectTest();
		ot.num2 =10;
		ot = new ObjectTest();
		System.out.println(ot.num2); // num2 == 10
		
	}
}
