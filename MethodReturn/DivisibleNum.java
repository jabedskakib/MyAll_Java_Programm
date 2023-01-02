package MethodReturn;

import java.util.Scanner;

public class DivisibleNum {
	static int isDivisible(int n) {
		int count=0;
		for(int i=1;i<=n;i++) {
			
			if(n%i==0) {
				count++;
			}	
		}
		
		return count;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number - ");
		int n = sc.nextInt();
		int count = isDivisible(n);

		System.out.println(count);



	}

}
