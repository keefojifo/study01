package study01.test07;

class Mother {
	public void cook() {
		System.out.println("재료가 없으니 물에 밥말아 먹어라.");
	}
}

public class Son extends Mother {
	
	public void cook(int a) {
		
		System.out.println("물밥 지겹다. 라면을 끓여 먹겠다.");
	}
	
	public static void main(String[] args) {
	Son s = new Son();
	s.cook(); // 상속 받은거
	
	}

}
