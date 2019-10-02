package study01.test07;

public class ArrayTest {

	public static void main(String[] args) {
		String[] strs = new String[5]; // new 스트링 초기화는 null 로 하였으나 5번 하는것이 아니라 배열 공간을 만드는 개념이다.
		/* strs[0] = "3"; */
		
		/*
		 * for (int i = 0; i < strs.length; i++) { strs[i] = Integer.toString((i+1)*10);
		 * } 
		 */

		
		for (int i = 0; i < strs.length; i++) {
			strs[i] = (i + 1) * 10 + "";
		}	
		for (int i = 0; i < strs.length; i++) 
		{ System.out.println(strs[i]); }
		
		/* strs[0].indexOf("1"); */
		/*
		 * System.out.println(strs[0].indexOf("0"));
		 * System.out.println(strs[0].indexOf("1"));
		 * System.out.println(strs[0].indexOf("2"));
		 * System.out.println(strs[0].indexOf("3"));
		 * System.out.println(strs[0].indexOf("4"));
		 */
	}
}
