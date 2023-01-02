package MethodReturn;

import java.util.Scanner;

public class SumOfSquareDigit {
	
	static int isSquareDigit(int x) {
		int sum = 0;
		int y=x*x;
		while(y!=0) {
			int z=y%10;
			sum=sum+z;
			y=y/10;
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Number -- ");
		int x=sc.nextInt();
		int sumOfDigit=isSquareDigit(x);
		System.out.println("Som of Natural Number is -- "+sumOfDigit);
	}

}
