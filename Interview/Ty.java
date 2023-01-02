package Interview;

import java.util.Scanner;

public class Ty {
	// Print the Second Smallest element in an Array
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int ar[] = {56,48,25,36,7,55,96,10};
		int n = sc.nextInt();
		int count=0;
		
		System.out.println("Smallest num--"+SmallestEle(ar));
		
		if(count<=n)
		{
			
		}
		
	}
	
	static int SmallestEle(int[] x)
	{
		int sm=x[0];
		for(int i=1;i<x.length;i++)
		{
			if(x[i]<sm) {
				
				sm=x[i];
			}
		}
		return sm;
		
		
		
	}

}
