package Inheritance.HirarchyLevel;

public class Car extends Vahicle {
	
	public static void main(String[] args) {
		
		Car c1 = new Car();
		
		c1.brand = "Roll-Royce";
		c1.color = "Black";
		c1.Price = 25000000;
		c1.cc = "999cc";
		
		System.out.println(c1.brand);
		System.out.println(c1.color);
		System.out.println(c1.Price);
		System.out.println(c1.cc);
		
		c1.start();
		c1.stop();
		
		
		
		
		
	}

}
