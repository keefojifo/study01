package test03;

import java.util.Scanner;

public class HowOldRU {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("너 몇살이야");

		String age = scan.nextLine();
		System.out.println("난" + age + "살이야");
		// parseint 에러의 위험성을 예측하고 있다.
		
		int num = Integer.parseInt(age);

		if (num <= 10) {
			System.out.print("어린이");
		} else if (num <= 20) {
			System.out.println("청소년");
		} else if (num <= 40) {
			System.out.println("청년");
		} else {
			System.out.println("꼰대");
		}
	}
}
