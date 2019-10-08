package study01.test10;

import java.util.ArrayList;

public class doublesort {
	
	public static void main(String[] args) {
		
		ArrayList<Double> nums = new ArrayList<Double>();
		nums.add(1.1);
		nums.add(1.3);
		nums.add(0.5);
		
//		System.out.println(nums.get(1));
		
//		
		for (int i = 0; i < nums.size();i ++) {
			for (int j = i +1; j < nums.size(); j++) {
			
				
			if(nums.get(i) > nums.get(j)) {	//0번이랑 1번이랑 비교 하고 0번이 터 크면 값을 봐꿔준다
			double temp = 0;
					temp = nums.get(i); //0번의 값을 temp  에 넣고
				
					nums.set(i,nums.get(j)); //j에다가는 temp를
					
					nums.set(j,temp);
					
					System.out.println(nums);
					
			}
				
				
			}
			
			
		}
		System.out.println(nums
				);
	}
}


