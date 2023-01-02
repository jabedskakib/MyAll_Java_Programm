package All;

import java.util.Iterator;

public class MainMethod {
	
	// Armstrong Number
	
	
	
	
	
	// Prime Number
	
	static String getPrime(int n)
	{
		int count=0;
			for (int i = 2; i < n/2; i++) 
			{
				if(n%i==0)
				{
					count=1;
				}
				
			}
			if(count==0)
			{
				return "Prime";
			}else {
				return "Not Prime";
			}
	}
	
	
	
	// Factorial Number
	
	static int getFactorial(int n)
	{
		int sum=1;
		for (int i = 2; i <= n; i++) 
		{
			sum=sum * i;
			
		}
		
		return sum;
	}
	
	// Strong Number

	static String getStrong(int n)
	{
		int sum=0;
		int fact=1;
		int x=n;
		
		
		while(n!=0)
		{
			int d = n%10;
			for (int i = 2; i <=d; i++) {
				fact=fact * i;
			}
			sum=sum+fact;
			n=n/10;
			
		}
		
		if(sum==x)
		{
			return "Strong";
		}
		
		return "Not Strong";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
