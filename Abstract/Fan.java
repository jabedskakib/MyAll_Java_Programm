package Abstract;

public class Fan extends Switch{

	@Override
	void switchOn()
	{
		System.out.println("Fan-On");
	}

	@Override
	void switchOff()
	{
		System.out.println("Fan-On");
	}
	public static void main(String[] args) {

		Fan f1=new Fan();
		
		f1.switchOn();
		f1.switchOff();
	}
}
