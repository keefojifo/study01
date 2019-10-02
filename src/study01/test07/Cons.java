package study01.test07;

import java.util.Scanner;

public class Cons {

	int num;
	
	public Cons() {
		System.out.println("아 내가 호출되었구나!");
	}
	
	public Cons(int num) {
		System.out.println("아 num 파라메터가 있는 날 호출 하였구나~");
	}

	public static void main(String[] args) {
		Cons c = new Cons(); //생성자 클래스 명과 동일해야 된다. 모두 다 읽고 변수들 다 초기화 시키고 실행이된다. 
		System.out.println(c.num);
		Scanner scan = new Scanner(System.in);
		
	}
}
