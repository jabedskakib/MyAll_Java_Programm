package Interviwe;

import java.util.Scanner;

public class Emp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int ar[][]=new int[a][b];
		
		int count=0;
		for(int i=1;i<ar.length;i++)
		{
			for(int j=0;j<ar[i].length;j++)
			{
				count++;
			}
		}
		System.out.println();
		
		
		
	}
	
}
