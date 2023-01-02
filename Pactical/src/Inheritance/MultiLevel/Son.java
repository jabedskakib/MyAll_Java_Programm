package Inheritance.MultiLevel;

public class Son extends Father{

	String bike = "Bullet";
	
	public static void main(String[] args) {
		Son s1 = new Son();
		
		System.out.println(s1.bike);
		System.out.println(s1.car);
		System.out.println(s1.money);
		System.out.println(s1.house);
	
		s1.Business();
		s1.programmer();
		s1.properties1();
		
		
		
		
		
	}
}
