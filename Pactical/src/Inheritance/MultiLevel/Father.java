package Inheritance.MultiLevel;

public class Father extends GrandFather {

	void Business() {
		System.out.println("Own Bussiness");
	}
	public static void main(String[] args) {
		Father f1 = new Father();
		
		System.out.println(f1.money);
		System.out.println(f1.car);
		System.out.println(f1.house);
		
		f1.Business();
		f1.dringking();
		f1.programmer();
		f1.properties1();
	}
}
