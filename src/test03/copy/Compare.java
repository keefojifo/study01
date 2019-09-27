package test03.copy;

public class Compare {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 5;

		System.out.println(num1 == num2);
		System.out.println(num1 != num2);
		System.out.println(num1 < num2);
		System.out.println(num1 > num2);
		System.out.println(num1 <= num2);
		System.out.println(num1 >= num2);

		//데이터 타입이 불린이니까 불린에 저장할 수 있다.
		boolean isSame = num1 == num2;
	}
}
