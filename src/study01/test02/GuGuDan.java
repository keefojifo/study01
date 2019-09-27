package study01.test02;

public class GuGuDan {
	
	public static void main(String[] args) {
		for(int num = 1;num<10;num++)
		{ System.out.println("2단 시작");
		for(int i = 1; i<10 ; i++) {
			
		System.out.print(num + "X" + i + "=" + (num*i));
			if(i!=9) {
				System.out.print(",");
				
			
			}
			
			
		}
		System.out.println();
		}
	}

}
