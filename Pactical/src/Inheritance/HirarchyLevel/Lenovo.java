package Inheritance.HirarchyLevel;

public class Lenovo extends Laptop{
	
	public static void main(String[] args) {
		Lenovo l1 = new Lenovo();
		l1.brand="Lenovo";
		l1.color="Gold";
		l1.price=79999;
		
		System.out.println(l1.brand);
		System.out.println(l1.color);
		System.out.println(l1.price);
		
		l1.os();
		l1.processor();
	}
	

}
