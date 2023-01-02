package InterFace;

public class TableFan extends Fan {
	
	public static void main(String[] args) {
		TableFan t1 = new TableFan();
		
		t1.name="Bajaj";
		t1.color="Black";
		t1.price=5000;
		
		System.out.println(t1.name);
		System.out.println(t1.color);
		System.out.println(t1.price);
		
		t1.switchOn();
		t1.switchOff();
		t1.incSpeed();
		t1.decSpeed();
	
		
		
		
	}

}
