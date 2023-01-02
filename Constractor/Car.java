package Constractor;

public class Car {

	String brand;
	String color;
	int price;

	Car(String b,String c,int p){
		
		brand = b;
		color = c;
		price = p;
	}
	public static void main(String[] args) {
		Car c1 = new Car("Honda","Black",1500000);
		Car c2 = new Car("BMW","White",4500000);
		
		System.out.println(c1.brand+" "+ c1.color+" "+ c1.price);
		System.out.println(c2.brand+" "+c2.color+" "+c2.price);
	}

}
