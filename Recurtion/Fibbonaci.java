package Recurtion;

import java.util.Scanner;

public class Fibbonaci {
	static int n1=0,n2=1,n3=0;
	
	static void fibbo(int n)
	{
		if(n>n3)
		{
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.print(n3+" ");
			fibbo(n);
		}
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Value - ");
		int n = sc.nextInt();
		
		System.out.print(n1+" "+n2+" ");
		fibbo(n);
		
		
	}

}
