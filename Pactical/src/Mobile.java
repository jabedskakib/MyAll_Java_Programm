
public class Mobile {
	String brand;
	int price;
	String color;


	Mobile(String b,int p,String c){
		this.brand=b;
		this.price=p;
		this.color=c;
		

	}
	public static void main(String[] args) {

		Mobile m1=new Mobile("Samsung",51999,"Black");
		Mobile m2=new Mobile("Redmi",55999,"Gray");
		Mobile m3=new Mobile("Iphone",65999,"Silver");
		
		System.out.println(m1.brand+" "+m1.price+" "+m1.color);
		System.out.println(m2.brand+" "+m2.price+" "+m2.color);
		System.out.println(m3.brand+" "+m3.price+" "+m3.color);
		
		
	}
}
