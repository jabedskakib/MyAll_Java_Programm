
public class Laptop {
	String brand;
	String name;
	String processor;
	int price;
	

	Laptop(String b,String n,String pro,int p) {
		// TODO Auto-generated constructor stub
		this.brand=b;
		this.name=n;
		this.processor=pro;
		this.price=p;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Laptop l1 = new Laptop("Dell","Inspiron","I3",78665);
		Laptop l2 = new Laptop("HP","pavilion","I7",62990);
		Laptop l3 = new Laptop("Apple","Mac-Book","I7",110000);
		
		System.out.println(l1.brand+" "+l1.name+" "+l1.processor+" "+l1.price);
		System.out.println(l2.brand+" "+l2.name+" "+l2.processor+" "+l2.price);
		System.out.println(l3.brand+" "+l3.name+" "+l3.processor+" "+l3.price);
		
	}

}
