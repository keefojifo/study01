package study01.test15;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapTest2 {

	public static void main(String[] args) {
		//Linked 라서 순서대로 출력이 된다. 그러나 순서를 알고 있는 것이 아니라 앞과 뒤를 알고 있는 것이다.
		//단일로만 map 을 사용하지 않는다.
		//map 이 더 속도가 좋다.
		//그래서 map을 사용을 더 많이 한다. 
		//링크드는 사용을 적게한다.
		Map <String,String> map = new LinkedHashMap<String,String>();
		
		map.put("좋아하는 음료수 1","커피");
		map.put("좋아하는 음료수 2","맥주");
		map.put("좋아하는 음료수 3","진로이즈백");
		map.put("좋아하는 음료수 4","콜라");
		map.put("테스트2","123132");
		map.put("테스트1"," value");
		map.put("테스트2"," value2");
		map.put("테스트3"," value");
		map.put("테스트4"," value");
		
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.println("KEY : "+ key + "Value :"+ map.get(key));
		}
		
	}
}
