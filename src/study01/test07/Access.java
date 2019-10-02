package study01.test07;

import java.util.Set;

 class Cat {
	private int age;
	private String name;
	private String type;
	
	public void test() {                 // () 안에 값이 있으면 다른 메소드이다. 메소드 이름이 같아도 데이터 타입을 넣으면 된다. 이런걸 오버 로딩이라고 한다.
		
	}
	public void test(int a) {
		
	}
	
	
	public void setAge(int age) {
		this.age = age;
		/* System.out.println(age); */
	}
	public int getAge() { //포조 방식 pojo(plain old java object)
		return age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	public String getType() {
		return type;
	}
}

public class Access {

	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.setAge(5);
		cat.setName("나비");
		cat.setType("남자");
		
		System.out.println(cat.getAge());
		System.out.println(cat.getName());
		System.out.println(cat.getType());
		System.out.print(1);
		
		cat.test(1);
		cat.test();
		
	}
}