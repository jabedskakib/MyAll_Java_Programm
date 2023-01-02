package InterFace;

public abstract class Exp implements Droable {
	public void dis1() {
		System.out.println("1");
	}
	
	public void dis2() {
		System.out.println("2");
	}
	
	public void dis3() {
		System.out.println("3");
	}
	
	public void dis4() {
		System.out.println("2");
	}
	
	
	public static void main(String[] args) {
		
		Exp e = new Exp();
		e.dis1();
	}

}
