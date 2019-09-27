package study01.test02;

public class Swap {

	public static void main(String[] args) {
		int a =3;
		int b =2;
		int c ;
		
		c=a;
		a=b;
		b=c;
		
		System.out.println(a);
		System.out.println(b);
			
		//배열에는 s를 붙힌다.
		int[] nums = new int[3];
		nums[0]= 1;
		nums[1]= 3;
		nums[2]= 5;
		
		 int[] tmpNums =nums; 
		nums =new int[4];
		nums[0]=tmpNums[0];
		nums[1]=tmpNums[1];
		nums[2]=tmpNums[2];
		nums[3]=7;
		
		System.out.println(nums[0]);
		System.out.println(nums[1]);
		System.out.println(nums[2]);
		System.out.println(nums[3]);
	}
}
