package Method;

public class ReturnMethod {
	int a;
	int b;
	int c;

	int display(int m,int n) {
		a=m;
		b=n;
		c=a+b;
		System.out.println("Wow ");
		return c;
	}
	public static void main(String[] args) {
		
	ReturnMethod m1 = new ReturnMethod();
	int x=m1.display(52,65);
	System.out.println(x);
	
	
	}
}










