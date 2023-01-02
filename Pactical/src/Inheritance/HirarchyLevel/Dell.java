package Inheritance.HirarchyLevel;

public class Dell extends Laptop{
	void os() {
		System.out.println("Windos ");
	}
	
	public static void main(String[] args) {
		Dell d1 = new Dell();
		d1.brand="DELL";
		d1.color="White";
		d1.price=99999;
		
		System.out.println(d1.brand);
		System.out.println(d1.color);
		System.out.println(d1.price);
		
		d1.os();
		d1.processor();
	}

}
