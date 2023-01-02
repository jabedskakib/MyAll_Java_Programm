package Try_Catch;

import java.util.Scanner;

public class Try_Catch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number ");
		int n=sc.nextInt();
		System.out.println("Start");
		System.out.println("Statement-1");
		
		System.out.println("Statement-2");
		
		try {
			System.out.println(100/n);
		}catch(ArithmeticException e){
			System.out.println("ArithmeticException ");
		}
		
		System.out.println("Statement Last");
		System.out.println("End");
	}
}
