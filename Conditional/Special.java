package Conditional;

import java.util.*;
public class Special {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number :-- ");
		int n=sc.nextInt();
		
		int d1=n/10;
		int d2=n%10;
		int sum = d1+d2+d1*d2;
		String s=(sum==n)?n+" is Special Number.":n+" is Not Special Number.";
		System.out.println(s);
		
	}

}
