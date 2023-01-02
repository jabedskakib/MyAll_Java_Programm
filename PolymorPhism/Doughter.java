package PolymorPhism;

class Doughter extends Father{

	void drink() {
		System.out.println("Horlics");
	}
	public static void main(String[] args) {

		Father f = new Son();
		f.drink();
	}

}

