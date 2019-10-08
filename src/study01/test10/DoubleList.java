package study01.test10;

import java.util.ArrayList;
import java.util.Random;

public class DoubleList {

	public static void main(String[] args) {

		/*
		 * ArrayList<String> strlist = new ArrayList<String>(); Random r = new Random();
		 * r.nextInt(100);
		 * 
		 * 
		 * Random r2 = new Random(); r2.nextInt(10);
		 * 
		 * strlist.add(r.nextInt(100) + "." + r2.nextInt(10));
		 * strlist.add(r.nextInt(100) + "." + r2.nextInt(10));
		 * strlist.add(r.nextInt(100) + "." + r2.nextInt(10));
		 * strlist.add(r.nextInt(100) + "." + r2.nextInt(10));
		 * strlist.add(r.nextInt(100) + "." + r2.nextInt(10));
		 * strlist.add(r.nextInt(100) + "." + r2.nextInt(10));
		 * strlist.add(r.nextInt(100) + "." + r2.nextInt(10));
		 * strlist.add(r.nextInt(100) + "." + r2.nextInt(10));
		 * strlist.add(r.nextInt(100) + "." + r2.nextInt(10));
		 * strlist.add(r.nextInt(100) + "." + r2.nextInt(10));
		 * strlist.add(r.nextInt(100) + "." + r2.nextInt(10));
		 * 
		 * 
		 * 
		 * 
		 * 
		 * System.out.println(strlist.clone());
		 */

		ArrayList<String> strList = new ArrayList<String>();
		ArrayList<Double> doubleList = new ArrayList<Double>();

		Random r = new Random();
		for (int i = 0; i < 10; i++) {

			strList.add(r.nextInt(100) + "." + r.nextInt(10));
			doubleList.add(Double.parseDouble(strList.get(i)));
		}
		System.out.println(strList);
		System.out.println(strList.get(0) + strList.get(1));
		strList.sort(null);
		System.out.println(strList);
		
		System.out.println(doubleList);
		System.out.println(doubleList.get(0) + doubleList.get(1));
		doubleList.sort(null);
		/*
		 * //0-9번째, 자기의 방을 제외한 방의 값과 비교 1번방부터 9번방까지 위의 단꼐와 같이 모든 방의 수와 비교 자신이 가장 작은 수면
		 * 0번째 방에 대입 그 다음 작은 수부터는 순차적으로 대입
		 */
		System.out.println(doubleList);
		

	 
		
	}

}
