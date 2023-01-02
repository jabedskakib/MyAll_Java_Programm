package Inheritance;

public class Son implements Father, Motherf {

	@Override
	public void care() {

		System.out.println("love");
	}
	public static void main(String[] args) {
		
		Son s = new Son();
		s.care();
	}

}
