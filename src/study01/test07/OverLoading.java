package study01.test07;

public class OverLoading {

	public void test() {
		System.out.println("test() 메소드 호출!");
	}
	public void test(int num) {
		System.out.println("test(int num) 메소드 호출!");
	}
	public void test(String str) {
		System.out.println("test(String) 메소드 호출!");
	}
	public void test(int num,String str) {
		System.out.println("test(int num, String str) 메소드 호출!");
	}
	public void test(String str,int num) {
		System.out.println("test(String str,int num) 메소드 호출!");
	}
	
	public static void main(String[] args) {
		OverLoading ol = new OverLoading();
		ol.test("dd");
		ol.test();
		ol.test(1);
		ol.test("dd",1);
		ol.test(1,"dd");
		
	//System.out.println(ol.test()); void 라서 에러가 난다. 아무것도 주지 않는거라서
	}
}
