package InterFace;

import javax.swing.event.HyperlinkEvent;

public class Fan implements HybrideSwitch {

	String name;
	String color;
	int price;

	void display()
	{
		System.out.println(this.name);
		System.out.println(this.color);
		System.out.println(this.price);
	}

	@Override
	public
	
	void switchOn() {
		System.out.println("Switch-On");
	}
	@Override
	public
	void switchOff() {
		System.out.println("Switch-Off");
	}
	@Override
	public
	void incSpeed() {
		System.out.println("Increase-Speed");
	}
	@Override
	public
	void decSpeed() {
		System.out.println("Decrease-Speed");
	}
	
	


}


