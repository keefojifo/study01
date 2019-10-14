package study01.test13;


public class ListTest {
	
		private String[] strs;
		
		
		public ListTest( ) {
			this.strs = new String[0];
			
		}
		
		public int size() {
			return this.strs.length;
		}
		
		public void add(String str) {
			String[] tmpStr = this.strs; //복사를 해서 
			this.strs = new String[this.strs.length+1];
			this.strs[this.strs.length-1] = str;
			for (int i = 0; i < tmpStr.length; i++) { // 값을 하나씩 대입해
				this.strs[i] = tmpStr[i];
			}	
		}
		
		
	
//		temp = strs[0]
//		strs[0] = strs[1] 
//		strs[1] = temp
		

		public static void main(String[] args) {
		
		ListTest lt = new ListTest();
		lt.add("a");
		lt.add("b");
		lt.add("c");
		System.out.println(lt.size());
		System.out.println(lt.strs[0]);
		System.out.println(lt.strs[1]);
		System.out.println(lt.strs[2]);
	
	
		
		
		}
	}


