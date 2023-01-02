package Recurtion;

import java.util.Scanner;

public class SumofInteger {
	static int sum(int n)
	{
		if(n>0)
		{
			return n+sum(n-1);
		}else {
			return 0;
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Value - ");
		int n =sc.nextInt();
		
		System.out.println("The Sum of Integer is- "+sum(n));
				
	}
	
	

}
