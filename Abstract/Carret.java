package Abstract;

public class Carret extends Vegetable{
	@Override
	void prepareDish()
	{
		System.out.println("Carret Halwa");
		
	}
	public static void main(String[] args) {
		
		Carret c1 = new Carret();
		
		c1.color="red";
		c1.cutvegetable();
		c1.washvegetable();
		c1.prepareDish();
	}

}
