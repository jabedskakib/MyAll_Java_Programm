package Inheritance.HirarchyLevel;

public class Bus extends Vahicle {
public static void main(String[] args) {
		
		Bus b1 = new Bus();
		
		b1.brand = "Tata";
		b1.color = "White";
		b1.Price = 3000000;
		b1.cc = "700cc";
		
		System.out.println(b1.brand);
		System.out.println(b1.color);
		System.out.println(b1.Price);
		System.out.println(b1.cc);
		
		b1.start();
		b1.stop();
		
		
		
		
		
	}

}
