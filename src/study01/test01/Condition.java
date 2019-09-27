package study01.test01;

public class Condition {

	public static void main(String[] args) {
		int num = 2;

		if (num == 1) {
			System.out.println("1이 맞네요");
		} else if (num == 2) {
			System.out.println("1이 아니네요");
		} else {
			System.out.println("1도 2도 아니네요");
		}
		System.out.println("완료");

		String trans = "여자";
// String 을 아래와 같이 비교하면 안된다.
		if (trans == "남자") {
			System.out.println("남자가 맞네요");
		} else {
			System.out.println("여자 입니다.");
		}
	}
}
