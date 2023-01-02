package Method;

public class ReturnType {
	// <<------- :: Code Duplication in Method ::------->>
	
	// <<------- :: Variable Shadowing ::------->>
	
//	String a = "java";
//	void dis() {
//		
//		int a = 30; // Error --- Code Duplication
//		System.out.println(a);
//		System.out.println(this.a);
//	}
//	public static void main(String[] args) {
//		ReturnType t1 = new ReturnType();
//		t1.dis();
//	}
	
	
	// <<------- :: Parameter Method ::------->>

//	void dis(int a,int b,int c) {
//		int x = a;
//		int y = b;
//		int z = c;
//		System.out.println(x+y+z);
//	}
//	public static void main(String[] args) {
//		ReturnType t1 = new ReturnType();
//		t1.dis(10, 20, 35);
//	}
	
	
	// <<------- :: Variable in Method ::------->>
	
	
//	void dis() {
//		int a = 500;
//		System.out.println(a);
//	}
//	public static void main(String[] args) {
//		ReturnType t1 = new ReturnType();
//		t1.dis();
//	}
	
	
	
	// <<------- :: Code Method Chaining ::------->>
	
//	void dis() {
//		System.out.println("Hello");
//		this.dis1();
//		System.out.println("How R U");
//	}
//	void dis1() {
//		System.out.println("Akib");
//	}
//	public static void main(String[] args) {
//		ReturnType t1 = new ReturnType();
//		t1.dis();
//	}
	
	
	
	
	
	// <<------- :: Code Duplication in Method ::------->>
	
//	
//	void dis() {
//		String a = "java";
//		//int a = 30; // Error --- Code Duplication
//		System.out.println(a);
//		//System.out.println(this.a);
//	}
//	public static void main(String[] args) {
//		ReturnType t1 = new ReturnType();
//		t1.dis();
//	}
	
	
	
	
	
	
	// <<------- :: Return Type Method ::------->>
	
//	String test() {
//		return "java";
//	}
//	public static void main(String[] args) {
//		ReturnType t1 = new ReturnType();
//		System.out.println(t1.test());
//	}
	
	
	
	// <<------- :: Return Type Variable ::------->>
	
//	
//	String test() {
//		String name= "Java";
//		return name;
//	}
//	public static void main(String[] args) {
//		ReturnType t1 = new ReturnType();
//		 System.out.println(t1.test());
//	}
	
	
	
	// <<------- :: Return Type Expression ::------->>
	
//	
//	int test(int a, int b) {
//		System.out.println("Sum of Two Number");
//		return a+b;
//	}
//	public static void main(String[] args) {
//		ReturnType t1 = new ReturnType();
//		int x = t1.test(20,20);
//		System.out.println(x);
//	}

	
	
	// <<------- :: Return Type Parameter ::------->>
	
	
//	String test(String a,int b) {
//		System.out.println("Hello");
//		return a +" " +b;
//	}
//	public static void main(String[] args) {
//		ReturnType t1 = new ReturnType();
//		
//		String x= t1.test("Java", 10);
//		System.out.println(x);
//	}
}
