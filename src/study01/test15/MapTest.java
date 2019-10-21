package study01.test15;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapTest {
//map은 순서가 없다
	// list 는 순서가 있다
	
	//내가 코딩을 하지 않았는데,어떤키에 어떤 밸류가 있는지 알수있는 방법,index라는 키가 integer가 아니다.
	//밸류가 저장되는 공간 키가 저장되어 있는 공간이 따로 있고 연결이 되어있다.
	
	public static void main(String[] args) {
		Map<String,String> map = new HashMap<String,String>();
		map.put("보물1호","컴퓨터");
		map.put("선호음식","초밥");
		map.put("해야할일","많다.");
		
		Iterator<String>it = map.keySet().iterator();
		while(it.hasNext()) { //has.Next 다음꺼는 가지고 있어?
			String key = it.next();
			System.out.println("key" + key);
			String value = map.get(key);
			System.out.println("value:" + value);
		}
		System.out.println(map);
	}
}
