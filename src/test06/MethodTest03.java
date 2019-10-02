package test06;

public class MethodTest03 { //메소드는 class 안에서만 선언 가능하다., 메소드 안에 메소드 선언 불가능하다)

	int num;

	int getNum() {
		
		System.out.println(num); //여기서의 num 은 MethodTest03의 num을 바라 보기 때문에 오류가 안난다.
		
		int num;                
		num = 1;
		System.out.println(num);
		System.out.println(this.num);  //getNum의 num 을 바라 보기 때문에 초기화 시키지 못해서 오류가 난다.
		
		return 1;	
	}
	public static void main(String[] args) {

		MethodTest03 mt3 = new MethodTest03(); // 여기서 0이 만들어 진다.
		mt3.getNum();
		
		System.out.println(mt3.num);
	}
}