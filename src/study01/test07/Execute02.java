package study01.test07;

class Calc02 {

	int num1;
	int num2;

	public void add() {
		System.out.println(num1 + num2);
	}

	public void minus() {
		System.out.println(num1 - num2);
	}

	public void multiple() {
		System.out.println(num1 * num2);
	}

	public void division() {
		System.out.println(num1 / num2);
	}
}

public class Execute02 {

	public static void main(String[] args) {

		/*
		 * Calc02 calc = new Calc02(); calc.num1 =5; calc.num2 = 3; calc.add();
		 * calc.minus(); calc.multiple(); calc.division();
		 */

		Calc02[] calcs = new Calc02[3];
		calcs[0] = new Calc02(); // 초기화
		calcs[0].add();
	

		System.out.println(calcs[0]);
		System.out.println(calcs[1]);
		System.out.println(calcs[2]);

	}
}