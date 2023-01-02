package Abstract;

public class Patato extends Vegetable{

	@Override
	void prepareDish()
	{
		System.out.println("Patato Chips");
	}
	
	
	public static void main(String[] args) {
		Patato p1 = new Patato();
		
		p1.cutvegetable();
		p1.washvegetable();
		p1.prepareDish();
		
	}
}
