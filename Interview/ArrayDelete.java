package Interview;

import java.util.Scanner;

public class ArrayDelete {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Deleted Position Num - ");
		int dp=sc.nextInt();
		
		int ar[]= {56,48,25,36,7,55,96,10};
		
		int ar1[]=new int[ar.length-1];
		
		for(int i=0;i<ar1.length;i++)
		{
			if(i<dp)
			{
				ar1[i]=ar[i];
			}else {
				ar1[i]=ar[i+1];
			}
		}
		
		for(int i=0;i<ar1.length;i++)
		{
			System.out.print(ar1[i]+" ");
		}
		
		
		
	}
}
