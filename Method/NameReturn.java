package Method;

public class NameReturn {
	String name(String m) {
		return m;
	}
	String last(String n) {
		
		return n;
	}
	
	String marge(String o,String p) { // Return Type 
		return o+" " +p;
	}
	
//	void marge(String o ,String p) {     // Void Type
//		System.out.println(o + " "+p);
//	}

	public static void main(String[] args) {
		NameReturn t1 = new NameReturn();
		String x= t1.name("Akib");
		String y= t1.last("Jabed");
		// t1.marge(x,y);
		String z = t1.marge(x, y);
		System.out.println(z);
	}
}
