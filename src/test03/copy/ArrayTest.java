package test03.copy;

public class ArrayTest {

	public static void main(String[] args) {
		// 디자인 패턴 ?
		// MVC 패턴이 필요로 하다
		int[] nums = new int[100];

		for (int i = 0; i < nums.length; i++) {

			{
				nums[i] = (i + 1) * 2;

				System.out.println(nums[i]);

			}

		}

	}
}
