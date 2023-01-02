package Abstract;

public class SBIBank extends Bank {
	@Override
	void getInterest()
	{
		System.out.println("7.5% Interst in SBI Bank");
	}

	public static void main(String[] args) {
		SBIBank s1= new SBIBank();
		s1.getInterest();
	}
}
