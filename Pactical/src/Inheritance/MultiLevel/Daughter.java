package Inheritance.MultiLevel;

public class Daughter extends Father{
	public static void main(String[] args) {
		Daughter d1 = new Daughter();
		System.out.println(d1.car);
		System.out.println(d1.house);
		System.out.println(d1.money);
		
		d1.Programmer1();
		d1.properties1();
		
				
	}

}
