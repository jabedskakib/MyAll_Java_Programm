package MethodReturn;

import java.util.Scanner;

public class NumOfDigit {
	static int isNumOfDigit(int x) {
		int sum = 0;
		
		while(x!=0) {
			int y = x;
			sum=sum+1;
			x=x/10;
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Number -- ");
		int x=sc.nextInt();
		int numOfDigit=isNumOfDigit(x);
		System.out.println("Som of Natural Number is -- "+numOfDigit);
	}

}
