
public class Casting {
	int a=1000;
	short s= (byte)a;
	byte b = (byte)(short)(int)a;
	double d=152.32;
	
	float f=(float)d;
	String name="Akib";
	String c = name;
	
	
	
	
	public static void main(String[] args) {
		Casting c1 = new Casting();
		
		System.out.println(c1.a);
		System.out.println(c1.s);
		System.out.println(c1.b);
		System.out.println(c1.d);
		System.out.println(c1.f);
		System.out.println(c1.name+" "+c1.c);
	}

}
