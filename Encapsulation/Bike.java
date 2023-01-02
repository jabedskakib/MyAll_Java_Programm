package Encapsulation;

public class Bike extends Vahicle{
	
	
	
	public static void main(String[] args) {
		
		
		Bike b1= new Bike();
		Bike b2=new Bike();
		
		b1.getBrand("yamaha");
		b1.getPrice(500000);
		b2.getBrand("BMW");
		b2.getPrice(50000000);
		
		System.out.println(b1.setBrand()+"   "+b1.setPrice());
		
		
		System.out.println(b2.setBrand()+"  "+b2.setPrice());
		
		
		
		
		
		
		
		
		
	}
	
	

}
