package study01.test02;

public class ArrayTest {
public static void main(String[] args) {
		int money1 = 0;
		int money2 = 100;
		int money3 = 500;
		int money4 = 1000;
	//new 라는 것이 방을 새롭게 만들어주는 것으로 생각하면 된다.
		int[] moneys=new int[4];
		
		
		moneys[0]=0;
		moneys[1]=100;
		moneys[2]=500;
		moneys[3]=1000;
		
		/*
		 * System.out.println(moneys[0]); System.out.println(moneys[1]);
		 * System.out.println(moneys[2]); System.out.println(moneys[3]);
		 * 
		 * System.out.println(moneys.length);
		 */
		for(int i = 0 ; i < moneys.length ;i++) {
			System.out.println(moneys[i]);
			
		}
}
}
