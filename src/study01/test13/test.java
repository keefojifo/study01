package study01.test13;

public class test {
	
	public static void main(String[] args) {
		String[] strs = new String[0];
		strs = new String[strs.length+1];
		strs[strs.length-1] = "123";
		
		System.out.println(strs.length);
		System.out.println(strs[0]);
		System.out.println(strs);
	
		
	}

}
