package Inheritance.HirarchyLevel;

public class Bike extends Vahicle {
public static void main(String[] args) {
		
		Bike b1 = new Bike();
		
		b1.brand = "Bullet";
		b1.color = "Black";
		b1.Price = 500000;
		b1.cc = "450cc";
		
		System.out.println(b1.brand);
		System.out.println(b1.color);
		System.out.println(b1.Price);
		System.out.println(b1.cc);
		
		b1.start();
		b1.stop();
		
		
		
		
		
	}

}
