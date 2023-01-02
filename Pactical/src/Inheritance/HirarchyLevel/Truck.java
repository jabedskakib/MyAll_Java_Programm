package Inheritance.HirarchyLevel;

public class Truck extends Vahicle {
public static void main(String[] args) {
		
		Truck t1 = new Truck();
		
		t1.brand = "Mahindra";
		t1.color = "Gold";
		t1.Price = 2500000;
		t1.cc = "500cc";
		
		System.out.println(t1.brand);
		System.out.println(t1.color);
		System.out.println(t1.Price);
		System.out.println(t1.cc);
		
		t1.start();
		t1.stop();
		
		
		
		
		
	}

}
