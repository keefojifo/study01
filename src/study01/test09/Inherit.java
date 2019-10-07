package study01.test09;

import java.util.Scanner;

import study01.test08.Atom;

public class Inherit extends Atom {
	
	static void test(Object i) {

	}
	public static void main(String[] args) {
		Object o = new Inherit();
		System.out.println(new Inherit());
		Object obj = 1;
		obj = "1";
		obj = true;
		obj = new Scanner(System.in);
		obj = new Atom();
		obj = new Inherit();
	}
}
