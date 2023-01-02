package Try_Catch;

import java.util.Scanner;

public class Atm {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int pin=1234;
		int balance = 168780;
		
		System.out.println("Enter Pin");
		int userPin = sc.nextInt();
		if(pin == userPin)
		{
			System.out.println("Enter Amount :-- ");
			int amount = sc.nextInt();
			
			if(amount > balance)
			{
				InsuficenBalancedException ibe = new InsuficenBalancedException();
				throw ibe;
			}else {
				System.out.println("Wait for Cash");
				System.out.println("Thank You !!!");
				System.out.println("Remove Card");
			}
			
		}else {
			IncorrectPinException ipe = new IncorrectPinException();
			throw ipe;
			
		}
		
		
		
		
		
		
	}

}
