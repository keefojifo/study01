package study01.test13;

public class ListTest {

	private String[] strs;

	public ListTest() {
		this.strs = new String[0];

	}

	public int size() {
		return this.strs.length;
	}

	public void add(String str) {
		String[] tmpStr = this.strs; // 복사를 해서
		this.strs = new String[this.strs.length + 1];
		this.strs[this.strs.length - 1] = str;
		for (int i = 0; i < tmpStr.length; i++) { // 값을 하나씩 대입해
			this.strs[i] = tmpStr[i];
		}
	}

	public String toString() {

		String str = "[";
		for (int i = 0; i < strs.length; i++) {
			str += strs[i] + ",";
		}
		str = str.substring(0, str.length() - 1);
		str += "]";
		return str;
	}

	private int indexOf(String str) {

		for (int i = 0; i < strs.length; i++) {
			if (strs[i] == str) {
				return i;
			}
		}
		return -1;
	}

	public void remove(String str) {
		int idx = indexOf(str);
		if (idx != -1) {
			remove(idx);
		}
	}

	public void remove(int idx) {

		String[] tmp = this.strs;
		this.strs = new String[this.strs.length - 1];
		for (int i = 0; i < idx; i++) {
			this.strs[i] = tmp[i];
		}
		for (int i = idx + 1; i < tmp.length; i++) {
			this.strs[i - 1] = tmp[i];
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
		System.out.println(lt.strs[0]);
		System.out.println(lt.strs[1]);
		System.out.println(lt);

	}
}
