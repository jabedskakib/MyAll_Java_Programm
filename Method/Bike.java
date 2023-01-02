package Method;

 

public class Bike {
	String name;
	String color;
	int price;
	float tax;

	public Bike(String n,String c,int p,float t) {
		// TODO Auto-generated constructor stub
		this.name=n;
		this.color=c;
		this.price=p;
		this.tax=t;
		
	}
	void details() {
		System.out.println(this.name);
		System.out.println(this.color);
		System.out.println("Selling Price "+this.price+this.tax);
		
	}
	public static void main(String[] args) {
		Bike b1 = new Bike("Honda","Red",90000,18000);
		Bike b2 = new Bike("Yamaha","Blue",130000,18500);
		Bike b3 = new Bike("Bajaj","Black",100000,18000);
		b1.details();
	}

}
