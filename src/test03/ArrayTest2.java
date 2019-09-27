package test03;

public class ArrayTest2 {

	public static void main(String[] arg) {

		int[] num = new int[10];

		for (int i = 0; i < num.length; i++) {

			num[i] = (i + 1) * 10;

			System.out.println(num[i]);

		}

	}
}
