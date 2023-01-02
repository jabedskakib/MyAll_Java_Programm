
public class Mobile {

	String brand;
	String name;
	int price;
	String ram;

	Mobile(String b,String n,int p,String r ) {
		// TODO Auto-generated constructor stub
		this.brand=b;
		this.name=n;
		this.price=p;
		this.ram=r;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mobile m1 = new Mobile("Realme","8pro",19999,"8gb");
		Mobile m2 = new Mobile("Redmi","9pro",19496,"8gb");
		Mobile m3 = new Mobile("Apple","Iphone 12",119900,"6gb");
	
		System.out.println(m1.brand+" "+m1.name+" "+m1.price+" "+m1.ram);
		System.out.println(m2.brand+" "+m2.name+" "+m2.price+" "+m2.ram);
		System.out.println(m3.brand+" "+m3.name+" "+m3.price+" "+m3.ram);
	}

}
