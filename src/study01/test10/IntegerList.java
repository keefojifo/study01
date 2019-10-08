package study01.test10;

import java.util.ArrayList;
import java.util.Random;

public class IntegerList {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		
		System.out.println(al.clone());
		System.out.println(al.indexOf(2));
		System.out.println(al.remove(al));
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i)); //값을 가져올때 . get(); //is,has가 나오면 데이터 타입이 boolean
		}
		
		
		/*
		 * //입력부 String[] strs = new String[3]; Random ran = new Random(); for (int i =
		 * 0; i < strs.length; i++) { strs[0] = 10+""; strs[1] = 20+""; strs[2] = 30+"";
		 * } //출력부 for (int i = 0; i < strs.length; i++) { System.out.print("[" +
		 * strs[i] + ""); }
		 */
	}

}
