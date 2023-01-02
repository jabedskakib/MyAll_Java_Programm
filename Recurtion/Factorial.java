package Recurtion;

import java.util.Scanner;

public class Factorial {
	static int factorial(int n)
	{
		if(n>0)
		{
			return n*factorial(n-1);
		}
		return 1;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Value - ");
		int n=sc.nextInt();
		System.out.println(n+" Factorial is - "+factorial(n));
		
	}
}
