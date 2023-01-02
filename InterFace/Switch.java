package InterFace;

public interface Switch {

	void switchOn();
	void switchOff();
}


interface Regulator{
	
	void incSpeed();
	void decSpeed();
}

interface HybrideSwitch extends Switch,Regulator
{
	
}
