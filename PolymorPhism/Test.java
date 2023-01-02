package PolymorPhism;

public class Test { // compile time Polymorphism
	
	static void display1() {
		System.out.println("Display-1");
	}
	static void display2() {
		System.out.println("Display-2");
	}
	static void display3() {
		System.out.println("Display-3");
	}
	static void display4() {
		System.out.println("Display-4");
	}
	
	public static void main(String[] args) {
		display1();
		display2();
		display3();
		display4();
	}

}
