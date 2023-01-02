package Method;  // Method Chaining Program 

public class Test {

	void  display1() {
		// TODO  Method stub
		System.out.println("start D1");
		this.display2();
		System.out.println("  D1 ");
		System.out.println(" End D1");
		this.display2();
		System.out.println("  End Method ");
	}
	
	Test(){
		System.out.println("  Start T1");
		System.out.println("  T1");
		System.out.println("  End T1");
	}
	
	void  display2() {
		// TODO Auto-generated constructor stub
		System.out.println("start D2");
		System.out.println("  D2");
		System.out.println(" End D2");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("  Strt ");
		Test t1 = new Test();
		System.out.println("  Contineu ");
		t1.display2();
		t1.display1();
		

	}

}
