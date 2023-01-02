package Array;

import java.util.Scanner;

public class Prime {
	
	static boolean Prime(int n) {
		for(int i=2;i<=n/2;i++) 
		{
			if (n%i==0) {
				return false;
			}
			else {
				return true;
			}
		}
		return false;
	}
	
	static void isPrime(int arr[])
	{
		int count=0;
		
		for(int i=0;i<arr.length;i++)
		{
			int a=arr[i];
			if(Prime(arr[i])==true)
			{
				count++;
			}
		}
		System.out.println("Prime num is :- "+count);
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
//		System.out.println("Enter the Array Size :- ");
//		int n = sc.nextInt();
//		int arr[]=new int[n];
//		for(int i=0;i<=n-1;i++)
//		{
//			System.out.print("Enter "+i+" Array :- ");
//			arr[i]=sc.nextInt();
//		}
		
		int arr[]= {13,7,10,31,17,24 };
		isPrime(arr);
	}

}
