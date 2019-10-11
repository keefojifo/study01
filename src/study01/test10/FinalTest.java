package study01.test10;

public class FinalTest {

	final int num = 1;// has been initialized

	public static void main(String[] args) {
			
			final int a =3; //최종 a는 더이상 변할 수 없다.
			//a = 5; 오류 난다.
			
			int num =3;
			String str = "넘은 3이 맞습니다.";
			if(num!=3)
				str = "넘은 3이 아닙니다.";
			
		str = (num ==3)? "넘은 3이 맞습니다.":"넘은3이 아닙니다.";
	System.out.println(str);
	System.out.println(str instanceof String); // String 이라고 불러도되? 라고 물어보는거
	FinalTest ft = new FinalTest();
	
	System.out.println(ft instanceof FinalTest);
	//System.out.println(ft instanceof FinalFather);
	System.out.println(ft instanceof Object);
		}
}
