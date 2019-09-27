package test03;

public class Increment {

	public static void main(String[] args) {
		int num = 1;
		// 아래 3개는 모두 같은 결과를 많이 사용한다.

		num = num + 1;
		// 다양한 수가 증가할때는 +=를 많이 사용
		num += 1;
		// 하나씩 증가할때는 ++ 를 많이 사용

		num++;
		// 출력을 먼저 실행하고 ++를 찍기 때문에 결과값이 4가 나온다( 후순위 연산자)
		System.out.println(num++);
		System.out.println(++num);

		num = num - 1; //5
		num -= 1;//4
		num--;//3
		System.out.println(num--);//3--2
		System.out.println(--num);//1
		
		for (int i = 1; i <=10 ; i++) {
			System.out.println(i);
		}

	}
}
