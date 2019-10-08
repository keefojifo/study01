package study01.test10;

public class ExceptionTest {

	public static void main(String[] args) {
		String strNum= "일이삼사";
		try {
			int num = Integer.parseInt(strNum);
			
			
			
		} catch (Exception e) {
			System.out.println(strNum + "은 숫자가 아닙니다.");
			// TODO: handle exception
		}
	
		
		
	}
}
