package study01.test13;

public class SubString {
	
	public static void main(String[] args) {
	String[] strs = new String[3];
	        strs[0] = "123";
			strs[1] = "123";
			strs[2] = "123";
			
			String str ="[";
					for (int i = 0; i < strs.length; i++) {
						str += strs[i]+",";
						
					}
					str =str.substring(0,str.length() -1);
							str +="]";
							
							System.out.println(strs);
	}
	

}
