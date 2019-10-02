package study01.test07;

class Calc03 {
	
	private int num1;
	private int num2;
	
	 Calc03 (int num1 , int num2) {
		 this.num1 = num1;
		 this.num2 = num2;
		
	}

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
	public class Execute03 {
		
		public static void main(String[] args) {

			Calc03 calc = new Calc03(10,5);
		/*
		 * calc.add(); calc.minus(); calc.multiple();
		 */
			calc.division();
		}
	}

