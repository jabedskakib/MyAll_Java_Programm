package Try_Catch;

import java.util.Scanner;

public class CoustomExp {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		int balance = 50000;
		System.out.println("Enter Widroll Amount-- ");
		int amount = sc.nextInt();
		if(amount>balance)
		{
			InsuficiantBalance ib = new InsuficiantBalance();
			throw ib;
		}else {
			System.out.println("Please Wait.....");
			System.out.println("Collect Cash.");
		}
		
		
	}

}
