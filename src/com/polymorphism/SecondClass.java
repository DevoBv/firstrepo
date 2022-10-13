package com.polymorphism;

public class SecondClass extends FirstClass {
	/*public void m1() {
		System.out.println("m1 method from secondClass");
	}

	public static void m2() {
		System.out.println("m2 method from secondclass");
	}*/

	public void m3() {
		System.out.println("m3 method with no argument");
	}

	public void m3(int a) {
		System.out.println("m3 method with argument");
	}

	public static void main(String[] args) {
		SecondClass firstClass = new SecondClass();
		/*firstClass.m1();
		firstClass.m2();*/
	firstClass.m3();
	}
}
