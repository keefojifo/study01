package study01.test10;

import java.util.Random;

public class Sort {

	public static void main(String[] args) {
		int[] nums = new int[10];
		Random r = new Random();
		
		//입력부
		for (int i = 0; i < nums.length; i++) {
			nums[i] = r.nextInt(100);
			//System.out.println(r.nextInt(100));
			/*
			 * System.out.println(nums[1]); System.out.println(nums[2]);
			 */
		}
		
		//정렬
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1 ; j < nums.length; j++) {
				if(nums[j] > nums[i]) { //0번 방보다 1번방이 더 크다면 nums[i] 와 nums[j] 를 교체 하고
					int temp =0;
					temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
					
					/*
*/
					
					//a = b 
					//b = c
					//c = a
				}
			
		}
		}
			  //출력부 
			for (int i = 0; i < nums.length; i++) { System.out.println(nums[i]);
			 
		}
			
		}	
		
}

