package Method;

class son1 extends father1 {

	void display(father1 f) {
		System.out.println("display");
	}
	public static void main(String[] args) {
		son1 s= new son1();
		s.display(null);
		s.display(s);
		s.display(new son1());
		s.display(new father1());
		father1 f= new father1();
		s.display(f);
		s.display(new father1());


	}

}
