package Method;

public class Shadowing {

	String s="Java";
	
	void dis() {
		String s="SQL";
		System.out.println(s);
		System.out.println(this.s);
	}
	void dis1() {
		int s = 500;
		System.out.println(s);
	}
	
	
	
	public static void main(String[] args) {
		Shadowing s1 = new Shadowing();
		s1.dis();
		s1.dis1();
	}
}
