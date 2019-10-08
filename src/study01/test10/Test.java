package study01.test10;

import java.util.Random;

public class Test {

	public static void main(String[] args) {
		Random rNum = new Random();
		int fNum = rNum.nextInt(100); // rNum 의 nextInt
		int sNum = rNum.nextInt(10);
		System.out.println(fNum);
		System.out.println(sNum);
		
		String str = fNum + "." + sNum;
		System.out.println(str+1);
		System.out.println(Double.parseDouble(str)+ 1);
		
		

	}
}
