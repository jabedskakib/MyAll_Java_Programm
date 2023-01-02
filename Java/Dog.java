
public class Dog {
	String bread;
	String color;
	String price;
	public static void main(String[] args) {
		Dog d1 = new Dog();
		Dog d2 = new Dog();
		Dog d3 = new Dog();
		
		d1.bread = "Bulldog";
		d1.color = "Brown";
		d1.price = "100000";
		
		d2.bread = "JarmanSefard";
		d2.color = "Black";
		d2.price = "150000";
		
		d3.bread = "Vodafone";
		d3.color = "Black-White";
		d3.price = "200000";
	System.out.println(d1.color);
	System.out.println(d2);
	System.out.println(d3);
	
	}
}
