package study01.test14;

import com.sun.org.apache.xerces.internal.impl.xs.SubstitutionGroupHandler;

import study01.test13.ListTest;
import study01.test13.SubString;

public class ListTextReview {

	private String[] strs;
	
	public void ListTextReview(){
	this.strs = new String[0];
	}
	
	public int size() {
		return this.strs.length;
	}
	
	public void add(String str) {
		String[] tmpStrs =  this.strs;
		this.strs = new String[this.strs.length +1];
		this.strs[this.strs.length -1 ] = str;
		for (int i = 0; i < tmpStrs.length; i++) {
			this.strs[i] = tmpStrs[i];
		}
		
	}
	

	public String toString() {
		String str = "[";
		for (int i = 0; i < strs.length; i++) {
			str += strs[i]+",";
		}
		str.substring(0,str.length() -1); 
		str += "]";
				
		return str;
	}
	
	public void remove(int idx) {
		String[] tmp = this.strs;
		this.strs = new String[this.strs.length -1];
		for (int i = 0; i < idx; i++) {
			this.strs[i] = tmp[i];
		}
		for (int i = idx +1; i < tmp.length; i++) {
			this.strs[i -1] = tmp[i];
		}
	}
	
	public static void main(String[] args) {
		ListTest lt = new ListTest();
		lt.add("a");
		lt.add("b");
		lt.add("c");
		lt.add("d");
		lt.remove(2);
		lt.remove("a");
		System.out.println(lt.size());
		
		System.out.println(lt);
	}
}
