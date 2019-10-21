package study01.test15;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTestRepetition {
	
	public static void main (String[] args) {
		Map<String,String> map = new HashMap<String,String>();
		map.put("이름", "홍철기");
		map.put("나이 ","32");
		map.put("주소", "안양");
		Set <String> KeySet = map.keySet(); 
		Iterator<String> it = KeySet.iterator();
		
		while(it.hasNext()) {
			String key = it.next();
			System.out.println("key :" + key);
			String value = map.get(key);
			System.out.println("value:" + value);
			
			
		}
	}

}
