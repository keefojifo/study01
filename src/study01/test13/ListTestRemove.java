package study01.test13;

public class ListTestRemove {

	private String[] strs;

	public  ListTestRemove() {
		this.strs = new String[0];
	}

	public int size() {
		return this.strs.length;

	}

	public void add(String str) {
		String[] tmpStrs = this.strs;
		this.strs = new String[this.strs.length + 1];
		this.strs[this.strs.length - 1] = str;
		for (int i = 0; i < tmpStrs.length; i++) {
			this.strs[i]= tmpStrs[i]  ;
		}

	}
	
	
	
	/*
	 * public void remove(String str2) { String[] removeStrs = this.strs;
	 * 
	 * for (int i = 0; i < strs.length; i++) { if(this.strs[i] == str2) {
	 * this.strs[i] = ""; this.strs[i] = removeStrs[i]; }
	 * 
	 * }
	 * 
	 * 
	 * this.strs[this.strs.length -1] = "";
	 * 
	 * 
	 * for (int i = 0; i < removeStrs.length; i++) {
	 * 
	 * 
	 * this.strs[i] = removeStrs[i]; } }
	 */

	public static void main(String[] agrs) {
		ListTestRemove ltr = new ListTestRemove();
		ltr.add("a");
		ltr.add("b");
		ltr.add("c");
		//ltr.remove("a");

		System.out.println(ltr.size());
		System.out.println(ltr.strs[0]);
        System.out.println(ltr.strs[1]);
		System.out.println(ltr.strs[2]);
		
		String test = "12345";
		System.out.println(test.substring(1));
		System.out.println("12345".indexOf("3"));
		test =test.substring(2,3);
		System.out.println(test);

	}

}
