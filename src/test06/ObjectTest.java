package test06;

import com.sun.java_cup.internal.runtime.Scanner;

public class ObjectTest {
	int num1;
	int num2;
	String str;

	public static void main(String[] agrs) {
		ObjectTest ot = new ObjectTest();
		ObjectTest ot2 = new ObjectTest();
		System.out.println(ot.num1);

		ot.num1 = 5;  //ot 의 num1 는 5
 		ot.num2 = 10; //ot 의 num2 는 10

		System.out.println(ot.num1);
		System.out.println(ot.num2);

	ot = new ObjectTest(); //상자를 초기화 시켰다. 다시 새로 OT 상자를  만든다. 기존의 상자는 남아 있으므로 garbage 뭔가를 사용해서 지워줘야된다.
	//알아서 삭제는 되나 언제 되는지는 모른다.
		
		System.out.println(ot.num1);
		System.out.println(ot.num2);
	
		System.out.println(ot.num1 == ot.num2); //정해저 있는 데이터 타입은 비교가 가능하다. 
		System.out.println(ot.str == ot2.str);
		
		

		
		//접근제어자, 배열변수, 데이터 타입 비교
		/*
		 * num2 =3 ; System.out.println(num2);
		 */}
}
