
public class Bike {

	String name;
	int price;
	


	Bike(String n,int p){
		this.name=n;
		this.price=p;
		
		

	}
	public static void main(String[] args) {

		Bike b1=new Bike("Bullet",350000);
		Bike b2=new Bike("Duke",550000);
		Bike b3=new Bike("Yamaha",250000);
		
		System.out.println(b1.name+" "+b1.price);
		System.out.println(b2.name+" "+b2.price);
		System.out.println(b3.name+" "+b3.price);
		
		
	}
}
