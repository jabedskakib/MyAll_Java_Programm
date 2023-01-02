package MethodReturn;

import java.util.Scanner;

public class Factorial {
	static int isFactorial(int x) {
		int sum = 1;
		
		while(x!=0) {
			int y = x;
			sum=sum*y;
			x--;
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Number -- ");
		int x=sc.nextInt();
		int facto=isFactorial(x);
		System.out.println("The Factorial Number is -- "+facto);
	}


}
