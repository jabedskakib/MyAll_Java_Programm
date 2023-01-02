package Array;

import java.util.Scanner;

public class Biggest3 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int ar[]= {45,85,94,12,54,45,74};

		System.out.println("Enter which Biggest");
		int n=sc.nextInt();

		int rsb = getBig(ar,n);
		System.out.println(n+" Biggest Number is - "+rsb);

		int rss= getSmall(ar,n);
		System.out.println(n+" Smallest Number is - "+rss);


	}

	static int getSmall(int[] ar, int n) 
	{
		for(int i=0;i<ar.length;i++)
		{
			int count = 0;
			for(int j=0;j<ar.length;j++)
			{
				if(ar[j]<ar[i])// 45,85,94,12,54,45,74
				{
					count++;
				}
			}
			if(count==n-1)
			{
				return ar[i];
			}
			
		}


		return 0;
	}

	static int getBig(int[] ar, int n) 
	{
		for(int i=0;i<ar.length;i++)
		{
			int count=0;
			for(int j=0;j<ar.length;j++)
			{
				if(ar[j]>ar[i]) //45,85,94,12,54,45,74
				{
					count++;
				}
			}
			if(count == n-1)
			{
				return ar[i];
			}
		}
		return 0;
	}

}
