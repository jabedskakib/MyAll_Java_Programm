package Array;

import java.util.Scanner;

public class Palindrom {

	public void palindrom(int[] arr)
	{
		
		int count=0;
		
		for(int i=0;i<=arr.length-1;i++)
		{
			int palin = 0;
			int x=arr[i];
			int n=arr[i];
//			System.out.println(n);
			while(n!=0)
			{
				int d=n%10;
				palin=palin*10+d;
				n=n/10;
			}
//			System.out.println("p - "+palin);
			
			if(x==palin) 
			{
				count++;
			}
		}
		System.out.println(count);
//		return count;


	}

	public static void main(String[] args) {

		Palindrom p1=new Palindrom();
//
//		int arr[]= {454,456,959,856,878,954,323};
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Array Size :- ");
		int n = sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter "+i+" Array :- ");
			arr[i]=sc.nextInt();
		}

		p1.palindrom(arr);
		System.out.println(" Palindrom in Array");

	}

}
