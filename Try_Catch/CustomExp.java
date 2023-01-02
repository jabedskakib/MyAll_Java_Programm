package Try_Catch;

import java.util.*;

public class CustomExp {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Wel Come to ATM");
		int pin = 1234;
		System.out.println("Enter your Pin");
		int userPin = sc.nextInt();
		
		if(pin ==userPin)
		{
			System.out.println("Your Amount is - 10000");
			int ownCash = 10000;
			System.out.println("Enter Widrol Amount");
			int cash = sc.nextInt();
			
			if(cash > ownCash)
			{
				InSuffisentBallanse isb = new InSuffisentBallanse();
				throw isb;
			}else {
				System.out.println("Remove your Card");
				System.out.println("Wait for Cash...");
			}
			
		}else {
			
			InCorrectPin icp = new InCorrectPin();
			
			throw icp;
			
		}
		
		System.out.println("Transaction Complete");
		
		
		
	}
}
