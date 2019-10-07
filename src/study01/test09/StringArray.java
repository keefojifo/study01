package study01.test09;

import java.util.ArrayList;
import java.util.Random;

public class StringArray {

	public static void main(String[] args) {
		String[] strs = new String[10];
		//입력부
		Random ran = new Random();
		for (int i = 0; i < strs.length; i++) {
		int rNum = ran.nextInt(20)+1;
		 
			strs[i] =rNum+"";
		}
		
		/*
		 * //출력부 for (int i = 0; i < strs.length; i++) {
		 * 
		 * 
		 * System.out.println(strs[i]); }
		 */
		
		//wrapper class int -->Integer, char --> character
		//ArrayList<Integer> intList = new ArrayList<Integer>();
		ArrayList<String> strList = new ArrayList<String>(); //string만 담을수 있는 리스트, 유동적으로 사이즈가 늘어난다.
		/*
		 * strList.add("asdkasjdas"); strList.add("asdkasjdasdsa");
		 * strList.indexOf(strList); System.out.println(strList.size());
		 */
		
		strList.add("홍길동");
		strList.add("임꺽정");
		strList.add("이문수");
		strList.add("홍길동");
		
		System.out.println("===우리반 출석부===");
		for(int i =0; i<strList.size();i++) {
			System.out.println((i + ". " + strList.get(i)));
		
			
		}
		System.out.println("임꺽정은 " + strList.indexOf("홍길동") + "번째 있어요~");
		
		/*
		 * ArrayList<Integer> intList = new ArrayList<Integer>(); intList.add(1);
		 * intList.add(2); intList.add(3); System.out.println(intList);
		 */
		ArrayList<Object> intList = new ArrayList<Object>();
		intList.add(1);
		intList.add(2);
		intList.add(3.3);
		intList.add("안녕");
		System.out.println(intList);


		}
	}
	
	

