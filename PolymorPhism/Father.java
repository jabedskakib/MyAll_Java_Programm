package PolymorPhism;

public class Father {
	
	void drink() {
		System.out.println("Coffee");
	}
}

class Son extends Father{
	void drink() {
		System.out.println("Tea");
	}
}


