package study01.test11;

public class TvRemocon implements Remote {

	@Override
	public void on() {
	System.out.println("tv를 킵니다");	
	}

	@Override
	public void off() {
		System.out.println("tv를 끕니다.");
	}
	
}
