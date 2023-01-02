package Abstract;

public class HDFC_Bank extends Bank {
	@Override
	void getInterest()
	{
		System.out.println("9.5% Interst in HDFC Bank");
	}

	public static void main(String[] args) {
		HDFC_Bank h1=new HDFC_Bank();
		
		h1.getInterest();
	}
}
