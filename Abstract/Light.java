package Abstract;

public  class Light extends Switch{
	
	@Override
	void switchOn()
	{
		System.out.println("Lite-On");
	}
	
	@Override
	void switchOff()
	{
		System.out.println("Lite-Off");
	}
	
	public static void main(String[] args) {
		
		Light l1=new Light();
		
		l1.switchOn();
		l1.switchOff();
	}

}
