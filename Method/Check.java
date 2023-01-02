package Method;

public class Check {

	int a=10;
	static int b=20;
	
	static void main()
	{
		System.out.println(b);
	}
	
	void dis()
	{
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		
		Check s=new Check();
		
		main();
		
		s.dis();
		
		
		
	}
	
}
