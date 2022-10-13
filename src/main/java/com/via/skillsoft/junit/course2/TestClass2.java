package com.via.skillsoft.junit.course2;

public class TestClass2 extends TestClass implements Interface1, Interface2 {
	
	public TestClass2(int x) {
		this();
		System.out.println("2nd constructor");
	}
	
	public TestClass2() {
		System.out.println("default constructor");
	}

	public static void main(String[] args) {
		TestClass2 tc1 = new TestClass2();
		TestClass2 tc2 = new TestClass2(0);
	
	}
	
	
//	public static void main(String[] args) {
//		TestClass tc = new TestClass();
//		System.out.println(tc.num);
//	}
}
