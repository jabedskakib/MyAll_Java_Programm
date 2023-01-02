import java.util.*;
public class SimpleInterest {
	public static void main (String args[])
	{ 
		Scanner sc = new Scanner(System.in);
	 // principal amount, rate, time and simple interest respectively.
		System.out.println("Enter the Principal :--");
		int principal = sc.nextInt(); 
		System.out.println("Enter the Rate % :--");
		double rate = sc.nextDouble();
		System.out.println("Enter the Time :--");
		float time = sc.nextFloat();
		double si = (principal*rate*time)/100;
		System.out.println("Simple Interest is: " +si);
	}
	

}
