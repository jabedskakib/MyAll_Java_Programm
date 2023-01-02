package Abstract;

public abstract class Vegetable {
	String color;
	String price;
	
	void cutvegetable() {
		System.out.println("Cutvegetable");
	}
	
	void washvegetable() {
		System.out.println("Washvegetable");
	}
	
	abstract void prepareDish();

}
