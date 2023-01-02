class Reinitialization {
	String name = "Honda";
	public static void main(String[] args) {
		Reinitialization r1 = new Reinitialization();
		Reinitialization r2 = new Reinitialization();
		
		System.out.println(r1.name);
		r1.name="Yamaha";
		r2.name = "Suzuki";
		System.out.println(r2.name);
		
	}
}
