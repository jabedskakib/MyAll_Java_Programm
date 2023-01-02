package Method;

public class Honda {
	String Bike() {
		System.out.println("Bike Run on petrol");
		this.Car(10);
		return "Java";
		
	}
	int Car( int x) {
		System.out.println("Car Run of Disel");
		return 10;
	}

	public static void main(String[] args) {
		Honda h=new Honda();
		h.Bike();
	}

}
