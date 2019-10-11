package study01.test12;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class LibTest {
	
	public static void main(String[] args) {
		List<String> ages = new ArrayList<String>();
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i <= 10 ; i++) {
			System.out.println("나이를 입력해주세요 :");
			ages.add(scan.nextLine());
		}
		Collections.sort(ages);
		
		for (int i = 0; i < args.size(); i++) {
			System.out.println(ages.get(i));
			
			
		}
	}

}
