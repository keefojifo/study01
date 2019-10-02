package test06;

public class MethodTest02 {

	public static void main(String[] args) {
		String str = "1234567";
		int idx = str.indexOf("34"); // 첫번째 매칭이 되는 자리의 값이 나온다 34가 들어가면 2가 나오겠다.
										// 많이 사용한다.
										// int 정해진 함수에 메소드를 사용할수 없다.
										// 어디 자리에 있는지 찾는 함수

		System.out.println("1은 str의 " + (idx) + " index 자리에 있네요");
		
		/*
		 * String[] strs = null; strs[5] = "hello";
		 */
		
		String name = "경훈,선호,영현,종서,동민,혜영";
		String[] strs = name.split(","); //메소드의 호출 ,이걸로 스플릿 하면 안된다. 왜냐하면 , 를 많이 사용하기 때문이지 
		for (int i = 0; i < strs.length; i++) {
			System.out.println("이름:" + strs[i]);
			
		}
		
		
	}
}

