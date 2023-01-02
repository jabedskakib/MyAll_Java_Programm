package Inheritance.HirarchyLevel;

public class Hp extends Laptop {
	
	void processor() {
		System.out.println("Intel i3");
	}
	
	public static void main(String[] args) {
		Hp h1 = new Hp();
		h1.brand="HP";
		h1.color="Black";
		h1.price=49999;
		
		System.out.println(h1.brand);
		System.out.println(h1.color);
		System.out.println(h1.price);
		
		h1.os();
		h1.processor();
		
		
		
	}

}
