package Method;

import java.util.*;

public class PaymentOverloading {

	void payment() {

		System.out.println("Payment via Cash ");
	}
	void payment(String x,int y) {

		System.out.println("Payment via UPI ");
	}
	void payment(long z,String x) {

		System.out.println("Payment via Net-Banking ");
	}
	void payment(String x,long z,int y,int p) {

		System.out.println("Payment via Card ");
	}

	public static void main(String[] args) {
		PaymentOverloading p1 = new PaymentOverloading();
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose Payment Method --- ");
		System.out.println("Cash-1/UPI-2/Net-Banking-3/Card-4");
		int a = sc.nextInt();
		if(a==1) {
			p1.payment();
		}
		else if(a==2) {
			System.out.print("Enter Your UPI-Id -- ");
			String x = sc.next();
			System.out.println("Enter Your Pin -- ");
			int y = sc.nextInt();
			p1.payment(x,y);
		
		}
		else if(a==3) {
			System.out.println("Enter Your CustId -- ");
			long z = sc.nextLong();
			System.out.println("Enter Your Password -- ");
			String x = sc.next();
			p1.payment(z,x);
	
		}
		else if(a==4) {
			System.out.println("Enter Your Name -- ");
			String x = sc.nextLine();
			System.out.println();
			//String x = sc.nextLine();
			System.out.println("Enter Your Card Number -- ");
			long z = sc.nextLong();
			System.out.println("Enter Your CVV -- ");
			int y = sc.nextInt();
			System.out.println("Enter Your Pin -- ");
			int p = sc.nextInt();
			p1.payment(x,z,y,p);
		
		}else {
			System.out.println("Invalid Input Tyr Again");
		}
		
	}
}
