package study01.test02;

public class Var1 {
	
	public static void main(String[] args) {
		//특수기호는 일반적으로 안되지만 유일하게 $ 는 가능하다.
		// 숫자로 변수를 설정 할 수 없다.
		//한글 변수도 가능하다 그러나 그냥 사용하지 않는다.
		int $num;
		$num=1;
		System.out.print($num);
		
		int num1 =1;
		for(;num1<10 ; num1=num1+1) {
			System.out.println(num1);
		}
		System.out.print(num1);
	}

}
