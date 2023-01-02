package MethodReturn;

import java.util.Scanner;

public class SquerOfN {

	static int isSquerOfNum(int n, int p) {
		int sum = 1;
		for(int i=1;i<=p;i++) {

			sum = sum*n;
		}
		return sum;
	}


	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Number -- ");
		int n = sc.nextInt();
		int p =sc.nextInt();
		int square=isSquerOfNum(n,p);
		System.out.println(square);

	}
}
